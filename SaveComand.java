/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaveComand implements Comand{
    
    public static void save() throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nume:");
        String nume=reader.readLine();
        System.out.println("Calea:");
        String cale=reader.readLine();
        Catalog catalog=new Catalog(nume, cale);
        boolean flag =true;
        int n=1;
        while(flag){
            flag=false;
            System.out.println("Numarul de documente introduse");
            try{
                n=Integer.parseInt(reader.readLine());
            }
            catch (NumberFormatException e){
                System.out.println("Introdu un numar");
                flag=true;
            }
        }
        String id;
        String locatie;
        for (int i=0; i<n; i++){
            System.out.println("id " + i  + n);
            id=reader.readLine();
            if (catalog.findById(id)!=null){
                System.out.println("id existent");
                i--;
                continue;
            }

            System.out.println("Nume" + i  + n);
            nume=reader.readLine();
            System.out.println("Locatie" + i  + n);
            locatie=reader.readLine();
            Document d=new Document(id, nume, locatie);
            System.out.println("type tag" + i  + n);
            id=reader.readLine();
            System.out.println("tag" + i  + n);
            nume=reader.readLine();
            d.addTag(id, nume);
            catalog.add(d);
        }
        CatalogUtil.save(catalog);
        System.out.println("Documentul a fost salvat cu succes!");
    }
}
