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
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        HttpClientTask clientTask = new HttpClientTask();
        InetAddressTask inetTask = new InetAddressTask();

        clientTask.sendGetRequest();
        System.out.println("\n\n");

        try {
            String result = clientTask.sendPostRequest("https://jedangoding.com/api/post/save");
            System.out.println(result);
        } catch (IOException e) {
        }

        System.out.println("\n\n");
        inetTask.tryFindOutTheHostname();
        System.out.println("\n\n");
        inetTask.tryGetAllByName();

    }

}
