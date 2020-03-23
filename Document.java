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
public class Document implements Serializable{
    private String id;
 private String name;
 private String location; 
 private Map<String, Object> tags = new HashMap<>();
 
 public void addTag(String key, Object obj) {
 tags.put(key, obj);
 }
 
 Document(String id,String name,String location){
 this.name=name;
 this.id=id;
 this.location=location;
 }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }
 
 
}
