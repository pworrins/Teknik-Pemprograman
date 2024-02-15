/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Strings {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);

        String A;
        char[] awalA;
        char[] awalB;
        String B;
        int panjangA, panjangB;

        A=Input.nextLine();
        B=Input.nextLine();
        Input.close();

        panjangA= A.length();
        panjangB= B.length();

        System.out.println(panjangA+panjangB);
    
        if(A.compareTo(B)>0){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
        
        awalA=A.toCharArray();
        awalB=B.toCharArray();

        String a=String.valueOf(awalA[0]);
        String b=String.valueOf(awalB[0]);

        String kapitalA= a.toUpperCase();
        String kapitalB= b.toUpperCase();

        System.out.print(kapitalA);
        for(int x=1;x<panjangA;x++){
            System.out.print(awalA[x]);
        }
        System.out.print(" ");
        System.out.print(kapitalB);
        for(int x=1;x<panjangB;x++){
            System.out.print(awalB[x]);
        }
    }
}
