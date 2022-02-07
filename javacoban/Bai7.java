/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoban;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai7 {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    public void phepNhan() {
        System.out.println("Nhap vao mot so nguyen bat ky: ");
        int number = sc.nextInt();
        for (int i = 1; i <= 20; i++) {
            System.out.println("Ket qua la: " + number*i);
        }
      
    }
    public static void main(String[] args) {
        Bai7 b =new Bai7();
        b.phepNhan();
    }
}
