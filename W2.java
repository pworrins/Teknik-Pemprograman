/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.w2;

import java.util.Scanner;
import java.math.BigInteger;

/**
 *
 * @author USER
 */
public class W2 {

    public static void main(String[] args) {
        Scanner Input= new Scanner(System.in);
        int T;

        boolean bytee=false, shortt=false, longg=false, intt=false;
        System.out.print("Masukkan jumlah angka: ");
        T= Input.nextInt();
        
        BigInteger[] numbers = new BigInteger[T];

        
        
        for (int i = 0; i < T; i++) {
            System.out.print("Input angka ke-" + (i + 1) + ": ");
            numbers[i] = Input.nextBigInteger();	
        }
        Input.close();
        
        // Menampilkan penjelasan untuk setiap angka
        for (int i = 0; i < T; i++) {
            System.out.print(numbers[i] + " can be stored in: ");

            if (numbers[i].compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0 &&
                numbers[i].compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0) {
               bytee=true;
            }else{
                bytee=false;
            }
                
            if (numbers[i].compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0 &&
                numbers[i].compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0) {
                shortt=true;
            }else{
                shortt=false;
            
            }
            if (numbers[i].compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0 &&
                numbers[i].compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0) {
                intt=true;
            }else{
                intt=false;
            
            }
            if (numbers[i].compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0 &&
                numbers[i].compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0) {
                longg=true;
            }else{
                longg=false;
            
            }
            if (bytee || shortt || intt || longg){
            System.out.print(numbers[i]);
            System.out.println(" can be fitted in:");
            if(bytee){
                System.out.println("* byte");
            }
            if(shortt){
                System.out.println("* short");
            }
            if(intt){
                System.out.println("* integer");
            }
            if(longg){
                System.out.println("* long");
            }
        }else{
        	System.out.print(numbers[i]);
            System.out.println(" can't be fitted anywhere.");

            //System.out.println("or a BigInteger.");
        }    
    }
    }
}
