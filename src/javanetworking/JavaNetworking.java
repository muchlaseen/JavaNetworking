/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanetworking;

import java.io.IOException;

/**
 *
 * @author Native
 */
public class JavaNetworking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        HttpClientTask clientTask = new HttpClientTask();
        
        clientTask.sendGetRequest();
        System.out.println("\n\n");
        clientTask.sendPostRequest();
        
    }
    
}
