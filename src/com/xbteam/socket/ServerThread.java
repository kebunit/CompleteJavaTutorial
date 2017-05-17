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
public class ServerThread extends Thread {
    private BufferedReader inputStream = null;
    private PrintWriter outputStream = null;
    private String line = null;
    private Socket socket = null;
    
    public ServerThread(Socket s) {
        socket = s;
    } 
    
    public void connectSocket() {
        try {
            inputStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            outputStream = new PrintWriter(socket.getOutputStream());
        }
        catch(IOException e) {
            System.out.println("Connection failed!!! : "+ e);
        }
    }
    
    public void threadStreamHandler() {
        try {
            line = inputStream.readLine();
            while(line.compareTo("QUIT") != 0) {
                outputStream.println(line);
                outputStream.flush();
                System.out.println(this.getName() + " : " + line);
                line = inputStream.readLine();
            }
            socket.close();
            System.out.println(this.getName() +" disconnected!!!");
        }
        catch(IOException e) {
            System.out.println("Message cannot receive : "+ e);
        }
    }
    
    @Override
    public void run() {
        this.connectSocket();
        this.threadStreamHandler();
    }
}
