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
public class Bai2 {

    Scanner sc = new Scanner(System.in);

    public void display() {
        System.out.println("Nhap vao so:");
        int choise = sc.nextInt();
        switch (choise) {
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            default:
                System.out.println("");
                break;
        }
    }
    public static void main(String[] args) {
        Bai2 b = new Bai2();
        b.display();
    }
}
