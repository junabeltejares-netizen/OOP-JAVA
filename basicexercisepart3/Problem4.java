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
public class Problem4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        //Prompt for weight
        System.out.println("Input weight in pounds: ");
        double weight = scanner.nextDouble();
        
        //Prompt for height
        System.out.println("Input height in inches: ");
        double height = scanner.nextDouble();
        
        // Calculate BMI
        double bmi = (weight * 703) / (height * height);
        
        //Display result
        System.out.println("Body Mass Index is " + bmi);
        
        
        
        //       
    }
    
}
