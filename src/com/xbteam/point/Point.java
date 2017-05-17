/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xbteam.point;

/**
 *
 * @author sabit
 */
public class Point {
    private int absis;
    private int ordinat;
    
    public Point() {
        absis = 0;
        ordinat = 0;
    }
    
    public Point(int x, int y) {
        absis = x;
        ordinat = y;
    }
    
    /**
     * Getter and setter
     * @return 
     */
    public int getAbsis() { return absis; }
    public int getOrdinat() { return ordinat; }
    public void setAbsis(int x) { absis = x; }
    public void setOrdinat(int y) { ordinat = y; } 
    
    public void printPoint() {
        System.out.println("[ " + absis + ", " + ordinat + "]");
    }
    
    /**
     * Other methods below
     */
    
    /**
     * Test Main
     * @param args
     */
    
    public static void main(String args[]) {
        Point P = new Point();
        Point PP = new Point(6,4);
        P.printPoint();
        PP.printPoint();
    }

}