/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xbteam.collection;

import java.util.*;

/**
 *
 * @author sabit
 */
public class ListExample {
  public static void main(String args[]) {
    ArrayList<String> list=new ArrayList<>();//Creating arraylist 
    list.add("Tetap");//Adding object in arraylist  
    list.add("semangat");  
    list.add("broo");  
    list.add("!!!");  
    //Traversing list through Iterator  
    Iterator itr=list.iterator();  
    while(itr.hasNext()){  
     System.out.print(itr.next()+" ");  
    }
    System.out.println();
  }
}
