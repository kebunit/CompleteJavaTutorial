/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xbteam.security;

import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author sabit
 */
public class Md5Example {
    public static void main(String args[]) {
        try {
            if (args.length != 1) {
                System.out.println("Usage: java md5 < some_string >");
                System.exit(1);
            }
            // Create an output file "digest"
            FileOutputStream digestStream = new FileOutputStream("digest");
            // Use the MD5 algorithm. SHA will work as well
            MessageDigest md=MessageDigest.getInstance("MD5");
            byte buf[] = args[0].getBytes();
            // Update the data and digest it
            md.update(buf);
            digestStream.write(md.digest());
        } catch (NoSuchAlgorithmException | IOException e) {
            System.out.println(e);
        }
    }
}

