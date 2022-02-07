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
public class Bai4 {
    Scanner sc = new Scanner(System.in);
    public void checkRightTriangle() {
         System.out.print("Nhap vao canh thu 1: ");
        double a = sc.nextDouble();
        System.out.print("Nhap vao canh thu 2: ");
        double b = sc.nextDouble();
        System.out.print("Nhap vao canh thu 3: ");
        double c = sc.nextDouble();
        if ((a*a == b*b + c*c) || (b*b == a*a + c*c) || (c*c == a*a + b*b)) {
            System.out.println("Day la tam giac vuong");
        } else {
            System.out.println("Day khong phai tam giac vuong");
        }
    }
    public static void main(String[] args) {
        Bai4 b = new Bai4();
        b.checkRightTriangle();
        
    }
}
