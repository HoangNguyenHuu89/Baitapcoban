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
public class Bai20 {

    public static void main(String[] args) {

        String chuoi;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao mot chuoi bat ky: ");
        chuoi = sc.nextLine();

        if (chuoi.matches("^[A-Z][^\\s]{0,18}\\d$")) {
            System.out.println("Duyet");
        } else {
            System.out.println("Khong duyet");
        }

    }
}
