/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xbteam.line;

import com.xbteam.point.Point;

/**
 * LINE 
 * @version 1.0
 * @author sabit
 * @since April 2017
 */
public class Line {
    private Point pBase;
    private Point pPurpose;
    
    public Line() {
        pBase = new Point();
        pPurpose = new Point(9,9);
    }

    public Point getPBase() { return pBase; }
    public Point getPPurpose() { return pPurpose; }
    public void setPBase(Point P) { pBase = P; }
    public void setPPurpose(Point P) { pPurpose = P; }
    
    // tes main 
    public static void main(String args[]) {
        Line L = new Line();
        L.getPBase().printPoint();
        L.getPPurpose().printPoint();
    }
}
