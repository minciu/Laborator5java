/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.IOException;

/**
 *
 * @author user
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Lab5 app = new Lab5();
 app.testCreateSave();
 
    }
    private void testCreateSave() {
 Catalog catalog =
 new Catalog("Java Resources", "d:/java/catalog.ser");
 Document doc = new Document("java1", "Java Course 1",
 "https://profs.info.uaic.ro/~acf/java/slides/en/intro_slide_en.pdf");
 doc.addTag("type", "Slides");
 catalog.add(doc);
 }
 
}
