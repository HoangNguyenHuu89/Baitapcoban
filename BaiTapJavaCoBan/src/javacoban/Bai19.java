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
public class Bai19 {
     public static void main(String[] args)
   {
      String chuoi;
      int soLan = 0;
      Scanner sc = new Scanner(System.in);

      System.out.println("Nhap vao mot chuoi bat ky: ");
      chuoi = sc.nextLine();

      char mangKiTu[] = chuoi.toCharArray();
      for (int i = 0; i < mangKiTu.length; i++)
      {
         if ('a' == mangKiTu[i])
         {
            soLan++;
         }
      }
      System.out.println("So lan suat hien ky tu a: " + soLan);
   }
}
