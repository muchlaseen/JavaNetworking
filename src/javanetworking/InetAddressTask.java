/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanetworking;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Native
 */
public class InetAddressTask {

    String host1 = "jedangoding.com";
    String host2 = "youtube.com";

    public void tryFindOutTheHostname() throws UnknownHostException {
        System.out.println("PHRASE 3 : Implementasi fungsi-fungsi pada Class InetAddress\n");
        System.out.println("URL yang digunakan: '" + host1 + "'\n");

        try {
            InetAddress addr = InetAddress.getByName(host1);
            System.out.println("(*)Implementasi toString : " + addr.toString());
            System.out.println("(*)Implementasi getHostName: " + addr.getHostName());
            System.out.println("(*)Implementasi getHostAdress : " + addr.getHostAddress());
            System.out.println("(*)Implementasi getCanonicalHostname : " + addr.getCanonicalHostName() + "\n");

        } catch (UnknownHostException ex) {
            System.out.println("Could not resolve the Hostname!");
        }

    }

    public void tryGetAllByName() throws UnknownHostException {

        System.out.println("PHRASE 4 : Implementasi fungsi getAllByName\n");
        System.out.println("URL yang digunakan: \n"
                + "'" + host1 + "'\n"
                        + "'" + host2 + "'\n");

        try {
            InetAddress[] selfDomain = InetAddress.getAllByName(host1);
            InetAddress[] youtube = InetAddress.getAllByName(host2);

            System.out.println("Test InetAddress *getAllByName* for :" + host1
                    + "\nList of All Host Address : ");

            // print semua host address domain sendiri dengan menggunakan toString() 
            for (InetAddress addr1 : selfDomain) {
                System.out.println("(*)" + addr1.toString());
            }

            System.out.println("\nTest InetAddress *getAllByName* for :" + host2
                    + "\nList of All Host Address : ");

            // print semua hostaddress youtube dengan menggunakan toString() 
            for (InetAddress addr2 : youtube) {
                System.out.println("(*)" + addr2.toString());
            }

        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        }

    }
}
