/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.IOException;
import java.net.URISyntaxException;

public class Report implements Comand{
    public static void reportHTML(Catalog catalog) throws IOException, URISyntaxException {
        CatalogUtil.report(catalog);
    }
}
