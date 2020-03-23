/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
public class ListComand implements Comand{

    
    public static void list(Catalog catalog){
        System.out.println("Catalog");
        System.out.println("Nume: "+catalog.getName());
        for (Document d:catalog.getDocuments()){
            System.out.println(d.toString());
        }
    }
}
