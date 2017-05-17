/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xbteam.aritmatic;

/**
 *
 * @author sabit
 * @param <T>
 */
public class Addition <T extends Number> {
    private final T gx, gy;
    
    public Addition(T x, T y) {
        gx = x;
        gy = y;
    }
    
    public int add() {
        return gx.intValue() + gy.intValue();
    }
    
    
    @Override
    public String toString() {
        return gx +" + "+ gy +" = ";
    }
    
    
    public static void main(String agrs[]) {
        float x, y, result;
        x = (float) 200032;
        y = (float) 2139.23424;
        Addition<Float> A = new Addition<>(x, y);
        System.out.println(A.toString() + A.add());
        double dd;
        dd = Math.pow(2.0,4.0);
    }
}
