/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_22_adivinar;

import java.util.Scanner;

/**
 *
 * @author joji1
 */
public class EVA2_22_ADIVINAR {

    public static void main(String[] args) {
        int num=5;
        int valor=0;
        Scanner read = new Scanner(System.in);

    
        do{
        System.out.println("Adivina el numero");
            valor= read.nextInt();
        }while(num==valor);
    }
}
