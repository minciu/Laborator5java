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

public class ViewComand implements Comand{

    
    public static void view(Catalog catalog) throws IOException, URISyntaxException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String str;
        while(true){
            System.out.println("Testati 'view' pentru vizualizare");
            str=reader.readLine();
            if (str.compareTo("view")==0){
                System.out.println("id: ");
                str=reader.readLine();
                Document doc = catalog.findById(str);
                if (doc==null){
                    System.out.println("Documentul nu exista!");
                    continue;
                }
                System.out.println("Documentul a fost gasit.");
                CatalogUtil.view(doc);
            }
            else {
                
                return;
            }
        }
    }
}
