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
public class Problem2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // prompt user for input
        System.out.println("Input a value for inches: ");
        double inches = scanner.nextDouble();
        
        // convert inches to meters
        double meters = inches * 0.0254;
        
        //Display the result 
        System.out.printf("%If inches is%.If meters", inches, meters);      
        
    }   
}
