/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xbteam.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author sabit
 */
public class ClientHandler {
    private ServerSocket serverSocket =null;
    private Socket socket = null;

    public ClientHandler(int PORT) {
            try {
                    // server listening
                    serverSocket = new ServerSocket(PORT);
            }catch (IOException e) {
                    System.out.println("Listening failed!!!");
            }
    }

    public void runtimeServer() {
            int i = 0;
            while (true) {
                    try {
                            socket = serverSocket.accept();
                            ServerThread ST = new ServerThread(socket);
                            ST.start();
                            ST.setName("CLIENT-"+Integer.toString(++i));
                            System.out.println(ST.getName()+" connected!!! ");
                    } catch (IOException e) {
                            System.out.println("Connection error!!!");
                    }
            }
    }

    public static void main(String[] args) throws Exception{
            ClientHandler CH = new ClientHandler(5454);
            CH.runtimeServer();
    }
}
