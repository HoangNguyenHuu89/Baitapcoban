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
public class Bai11 {
    Scanner sc = new Scanner(System.in);
    static int[] arr;
    public int[]  array() {
        System.out.println("Nhap so luong phan tu cua mang: ");
        int number = sc.nextInt();
         arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Phan tu thu " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public void avgArray(int[] arr) {
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double)sum/(double)arr.length;
        System.out.println("Gia tri trung binh cua mang la: " + avg);
    }
    public static void main(String[] args) {
        Bai11 b =new Bai11();
        b.array();
        b.avgArray(arr);
    }
}
