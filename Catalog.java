/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.util.*;
import java.io.*; 

/**
 *
 * @author user
 */
public class Catalog implements Serializable {
    private String name;
 private String path;
 private List<Document> documents = new ArrayList<>();
 
 public void add(Document doc) {
 documents.add(doc);
 }
public Document findById(String id) {
    for (Document doc : documents) {
 if (doc.getId().equals(id)) {
 return doc;
 }
 }
 return null;
 }
Catalog(String name,String path){
    this.name=name;
    this.path=path;

}


}
