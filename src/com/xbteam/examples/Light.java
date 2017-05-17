/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xbteam.examples;

/**
 *
 * @author sabit
 */
public class Light {
    public static void main(String args[]) {
        int lightspeed;
        long days;
        long seconds;
        long distances;
        
        // Approximate speed of light in miles per second
        lightspeed = 186000;
        
        days = 1000; // spesify number of days here
        seconds = days * 24 * 60 * 60;
        distances = lightspeed  * seconds; // compute distances
        
        System.out.print("In "+ days);
        System.out.print(" days light will travel about ");
        System.out.println(distances + " miles.");
    }
}
