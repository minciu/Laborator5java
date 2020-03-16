/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.util.*;
import java.io.*; 
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

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
 tags.put(key, obj);}
 
 Document(String id,String name,String location){
 this.name=name;
 this.id=id;}
 
}
