/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicexercisepart1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Input a number ");
        int Num = sc.nextInt();
        
        System.out.println("Expected output: ");
        
        for (int i = 1; 1 < 11; i++ ) {
        System.out.println(Num + " x " + i + " = " + (Num * i));    
        }
    }
    
}
