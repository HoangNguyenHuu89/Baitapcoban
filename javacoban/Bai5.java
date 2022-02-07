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
public class Bai5 {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
   
    public void checkID() {
        System.out.println("Nhap vao ma sinh vien: ");
        String studentID = sc.nextLine();
        if (studentID.matches("B\\d{7}")) {
            System.out.println("Ma sinh vien hop le");
        }else {
            System.out.println("Ma sinh vien khong hop le");
        }
    }
   
    public static void main(String[] args) {
        Bai5 b = new Bai5();
        b.checkID();
        
    }
    
    
}
