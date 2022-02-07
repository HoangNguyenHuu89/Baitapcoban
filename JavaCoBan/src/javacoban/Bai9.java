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
public class Bai9 {
   static Scanner sc = new Scanner(System.in);
   public int fibonaci(int n) {
       if(n == 0 || n == 1) {
           return 1;
       }
       return fibonaci(n-1) + fibonaci(n-2);
   }
    public static void main(String[] args) {
        Bai9 b = new Bai9();
        System.out.println("Nhap vao 1 so nguyen trong khoang tu 1 den 20: ");
        int n = sc.nextInt();
        System.out.println(b.fibonaci(n));
    }
}
