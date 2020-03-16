/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
 
}
