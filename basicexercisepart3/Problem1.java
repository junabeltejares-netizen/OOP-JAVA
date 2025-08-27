/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicexercisepart3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
            
            // Prompt user input
            System.out.println("Input a degree in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            
            // Convert to Celcius
            double celsius = (fahrenheit - 32) * 5 / 9;
            
            // Display result 
            System.out.printf("%.if degrees Fahrenheit is equal to %.if in Celsius%n", fahrenheit, celsius);          
    }
       
    
    }
    

