/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xbteam.datetime;

import java.time.*;
import java.util.Date;


/**
 *
 * @author sabit
 */
public class MyLocalTime {
    public static void main(String args[]) {
        YearMonth date = YearMonth.now();
    System.out.printf("%s: %s%n", date, date.getMonth());
    }
}
