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
public class Bai8 {
    Scanner sc = new Scanner(System.in);
    public void soNguyenTo() {
        System.out.println("Nhap vao so nguyen: ");
        boolean soNguyenTo = false;
        int number = sc.nextInt();
        if(number > 1000) {
            System.out.println("So nguyen nhap vao khong vuot qua 1000");
        }
        System.out.println("Day so nguyen to la: ");
        for (int i = 1; i <= number; i++) {
            soNguyenTo = true;
            for (int j = 2; j < i; j++) {
                if(i%j == 0) {
                    soNguyenTo = false;
                }
            }
            if (soNguyenTo == true) {
                System.out.print(i + " ");
            }
        }
        
    }
    public static void main(String[] args) {
        Bai8 b = new Bai8();
        b.soNguyenTo();
    }
}
