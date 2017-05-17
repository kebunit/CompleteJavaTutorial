/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xbteam.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author sabit
 */
public class Client {
    public static void main(String[] args) throws Exception{
        Socket s = null;
        BufferedReader keyRead = null;
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        String line = null;
        String response = null;
        try {
                s = new Socket("localhost", 9000);
                keyRead = new BufferedReader(new InputStreamReader(System.in));
                inputStream = new BufferedReader(new InputStreamReader(s.getInputStream()));
                outputStream = new PrintWriter(s.getOutputStream());
                while(true) {
                        line = keyRead.readLine();
                        outputStream.println(line);
                        outputStream.flush();
                        response = inputStream.readLine();
                        if (response == null) {
                                break;
                        }
                        System.out.println("Response from Server : "+ response);
                }
                s.close();

        } catch (IOException e) {
                System.out.println("cannot connect to server");
        }

    }	
}
