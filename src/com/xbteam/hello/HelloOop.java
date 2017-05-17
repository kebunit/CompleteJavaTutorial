/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xbteam.hello;

/**
 *
 * @author sabit
 */
public class HelloOop {
    private String message = null;
    
    public HelloOop() {
        message = "Hello World!!!";
    }
    
    public HelloOop(String msg) {
        message = msg;
    }
    
    public void printHello() {
        System.out.println(message);
    }
    
    
    // main program : test
    public static void main(String args[]) {
        HelloOop HO = new HelloOop();
        HelloOop HOP = new HelloOop("Java Code");
        
        HO.printHello();
        HOP.printHello();
    }
}
