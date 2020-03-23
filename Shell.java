/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

/**
 *
 * @author user
 */
public class Shell {
    public void read()
            throws IOException, Exceptii {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String command;
        boolean flag=true;
        while(flag){
            command=reader.readLine();
           
        }
    }
}
