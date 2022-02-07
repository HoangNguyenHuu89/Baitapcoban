/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoban;

import java.util.Scanner;
import static javacoban.Bai12.arr;

/**
 *
 * @author admin
 */
public class Bai13 {
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
    public void findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }  
        }
        System.out.println("So nho nhat trong mang la: " + min);
    }
     public static void main(String[] args) {
        Bai13 b =new Bai13();
        b.array();
        b.findMin(arr);
    }
}
