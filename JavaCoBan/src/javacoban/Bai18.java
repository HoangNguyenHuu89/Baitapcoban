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
public class Bai18 {

    public static void main(String[] args) {
        String chuoi;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao mot chuoi: ");
        chuoi = sc.nextLine();

        if (chuoi.matches(".*\\d.*")) {
            System.out.println("Co");
        } else {
            System.out.println("Khong");
        }
    }
}
