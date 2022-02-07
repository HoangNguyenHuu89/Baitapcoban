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
public class Bai1 {
    Scanner sc = new Scanner(System.in);
    public void display() {
        System.out.print("Nhap vao so nguyen bat ky: ");
        int soNguyenDuong = sc.nextInt();
        if(soNguyenDuong >= 0) {
            System.out.println("Day la so nguyen duong");
        }else {
            System.out.println("Day la so nguyen am");
        }
                
    }
    public static void main(String[] args) {
        Bai1 b = new Bai1();
        b.display();
    }
}
