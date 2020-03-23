/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.util.*;
import java.io.*; 
import java.util.List;

/**
 *
 * @author user
 */
public class Catalog implements Serializable {
    private String name;
    private String path;
    private List<Document> documents = new ArrayList<>() ;
    
 
 public void add(Document doc) {
        getDocuments().add(doc);
 }
 
public Document findById(String id) {
    for (Document doc : getDocuments()) {
 if (doc.getId().equals(id)) {
 return doc;
 }
 }
 return null;
 }
Catalog(String name,String path){
    this.name=name;
    this.path=path;
    documents = new ArrayList<>();

}

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return the documents
     */
    public List<Document> getDocuments() {
        return documents;
    }

    /**
     * @param documents the documents to set
     */
    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }


}
