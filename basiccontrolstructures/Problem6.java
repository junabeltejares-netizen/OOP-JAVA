/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basiccontrolstructures;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        // Ask the user for the range
        System.out.print("Enter range: ");
        int range = scanner.nextInt();
        
        // Generate the multiplication table
        for (int i = 1; i < range; i++) {
            for (int j = 1; j <= range; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();      
            }
        }
       
}
