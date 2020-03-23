/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;

/**
 *
 * @author user
 */
public class CatalogUtil {
    public static Catalog load(String path)
    throws  IOException, ClassNotFoundException
    {
        Catalog catalog = new Catalog("new", path);
        try {
            FileInputStream inf = new FileInputStream(path);
            ObjectInputStream ino = new ObjectInputStream(inf);
            catalog = (Catalog) ino.readObject();
        }
        catch (IOException inout){
            System.out.println("Fila nu s-a putut citi");
            
        }catch(ClassNotFoundException clas){
            System.out.println("Fila nu s-a putut incarca");
           
        }
        return catalog;
}

 public static void save(Catalog catalog)
 throws IOException {
 try (ObjectOutputStream oos = new ObjectOutputStream(
 new FileOutputStream(catalog.getPath()))) {
 oos.writeObject(catalog);
 }
 catch (IOException inout){
            System.out.println("Fila nu s-a putut salva");
 }
 }
 
 public static void view(Document doc) throws IOException, URISyntaxException {


        Desktop desktop = Desktop.getDesktop();
        File file = new File("c:\\cygwin\\cygwin.bat");
        if (!file.isDirectory())
            file = file.getParentFile();
        if (file.exists()){
            desktop.open(new File(doc.getLocation()));
        }
        else
            desktop.browse(new URI(doc.getLocation()));

    }
 
  private static int rep=0;
  public static void report(Catalog catalog) throws IOException, URISyntaxException {
        File file=new File("report"+rep+".html");
        rep++;
        BufferedWriter writer=new BufferedWriter(new FileWriter(file));
        writer.write("<h1>"+catalog.getName()+ "</h1>");
       
        for (Document d:catalog.getDocuments()){
            writer.write("<p>" + d.toString()+ "</p>");   
        }
        writer.close();
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(new URI(file.getPath()));
    }
  
  
  
  
}
