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
public class HelloNative {
  public native void sayHi(String who, int times);

  static { System.loadLibrary("HelloImpl"); }

  public static void main (String[] args) {
    Hello hello = new Hello();
    hello.sayHi(args[0], Integer.parseInt(args[1]));
  }
}
