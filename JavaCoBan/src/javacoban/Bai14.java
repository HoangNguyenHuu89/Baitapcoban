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
public class Bai14 {

    Scanner sc = new Scanner(System.in);
    static int[] arr;

    public int[] array() {
        System.out.println("Nhap so luong phan tu cua mang: ");
        int number = sc.nextInt();
        arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public void sortArray(int[] arr) {
        int n = arr.length;
        //In ra mảng ban đầu
        System.out.print("Mang truoc khi dao nguoc: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //Đảo ngược mảng
        for (int i = 0; i < n / 2; i++) {
            int empty;
            empty = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = empty;
        }
        System.out.println();
        //In ra mảng sau khi đảo ngược
        System.out.print("Mang sau khi dao nguoc: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Bai14 b = new Bai14();
        b.array();
        b.sortArray(arr);
    }

}
