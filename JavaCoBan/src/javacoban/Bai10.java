/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoban;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai10 {
    Scanner sc = new Scanner(System.in);
    public void checkID() {
        String[] id = new String[5];
        for (int i = 0; i < id.length; i++) {
            System.out.println("Ma sinh vien thu " + (i+1) + ": ");
            id[i] = sc.next();
        }
        for (int i = 0; i < id.length; i++) {
            if(!id[i].matches("B170[1-9]{4}")) {
                System.out.println("Ma sinh vien thu " + (i+1) + " sai dinh dang");
            }
            
        }
    }
    public static void main(String[] args) {
      Bai10 b =new Bai10();
      b.checkID();
    }
}
