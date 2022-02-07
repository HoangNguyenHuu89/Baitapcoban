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
public class Bai16 {

    public static void main(String[] args) {
        String chuoi;
        char kiTu;
        boolean tonTai = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao mot chuoi: ");
        chuoi = sc.nextLine();
        System.out.println("Nhap vao ky tu muon kiem tra:");
        kiTu = sc.nextLine().charAt(0);

        char mangKiTu[] = chuoi.toCharArray();
        for (int i = 0; i < mangKiTu.length; i++) {
            if (kiTu == mangKiTu[i]) {
                System.out.println("Co");
                tonTai = true;
            }
        }
        if (tonTai == false) {
            System.out.println("Khong");
        }
    }

}
