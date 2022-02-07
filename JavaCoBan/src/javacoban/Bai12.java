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
public class Bai12 {
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
    public void findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }  
        }
        System.out.println("So lon nhat trong mang la: " + max);
    }
    public static void main(String[] args) {
        Bai12 b =new Bai12();
        b.array();
        b.findMax(arr);
    }
}
