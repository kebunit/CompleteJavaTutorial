/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xbteam.examples;

import java.util.UUID;

/**
 *
 * @author sabit
 */
public class RamdomNumber {
    
    public static void main(String args[]) {
        String tGeneratedUUIDString = UUID.randomUUID().toString().replace("-", "--").toUpperCase();
        System.out.println(tGeneratedUUIDString);
    }
 
}
