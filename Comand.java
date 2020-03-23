/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author user
 */

import java.io.IOException;
import java.net.URISyntaxException;
public interface Comand {
    
    public static void list(Catalog catalog){

    }
    
    public static void load() throws IOException, ClassNotFoundException, URISyntaxException{

    }
    
    public static void save() throws IOException {

    }
    
    public static void view(Catalog catalog) throws IOException, URISyntaxException {

    }
    
    
    public static void reportHTML(Catalog catalog) throws IOException, URISyntaxException{
        CatalogUtil.report(catalog);
    }
    
   
    
}
