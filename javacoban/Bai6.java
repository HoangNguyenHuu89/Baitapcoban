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
public class Bai6 {

    Scanner sc = new Scanner(System.in);

    public void sum() {
        System.out.print("Nhap vao 1 so nguyen: ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Tong tat ca cac so chan trong khoang tu 0 den " + number + " la: " + sum);
    }

    public static void main(String[] args) {
        Bai6 b = new Bai6();
        b.sum();
    }
}
