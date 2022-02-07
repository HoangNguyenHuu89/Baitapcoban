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
public class Bai15 {
     Scanner sc = new Scanner(System.in);
    static String[] arr = new String[5];
    public String[]  array() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Ma sinh vien thu " + (i+1) + ": ");
            arr[i] = sc.next();
        }
        return arr;
    }
    public void checkID(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(!arr[i].matches("00[2-5]L\\d{4}")) {
                System.out.println("Sai roi");
                return;
            }
        }
        System.out.println("Dung roi");
    }
    public static void main(String[] args) {
        Bai15 b =new Bai15();
        b.array();
        b.checkID(arr);
    }
}
