/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;

public class LoadComand implements Comand{

  
    public static void load() throws IOException, ClassNotFoundException, URISyntaxException {
        Catalog catalog;
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Calea catalogului: ");
        String cale=reader.readLine();
        try {
            catalog = CatalogUtil.load(cale);
        } catch (ClassNotFoundException e) {
            System.out.println("Incarcarea a esuat! ");
            throw e;
        }
        System.out.println("Incarcarea a reusit ");
        
        cale=reader.readLine();
        if (cale.compareTo("view")==0)
            Report.reportHTML(catalog);
        else
        if (cale.compareTo("list")==0)
            ListComand.list(catalog);
        else if (cale.compareTo("quit")==0)
            return;
        ViewComand.view(catalog);

    }
}