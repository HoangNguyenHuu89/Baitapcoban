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
public class Bai3 {

    Scanner sc = new Scanner(System.in);
    public void checkTriangle() {
         System.out.print("Nhap vao canh thu 1: ");
        double a = sc.nextDouble();
        System.out.print("Nhap vao canh thu 2: ");
        double b = sc.nextDouble();
        System.out.print("Nhap vao canh thu 3: ");
        double c = sc.nextDouble();
        if (a + b > c || a + c > b || b + c > a) {
            System.out.println("Day la tam giac");
        } else {
            System.out.println("Day khong phai tam giac");
        }
    }
    public static void main(String[] args) {
        Bai3 b = new Bai3();
       b.checkTriangle();
        
    }
}
