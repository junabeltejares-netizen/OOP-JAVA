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
public class Problem5 {
       public static void main(String[] args) {
    
        Scanner scanner = new Scanner (System.in);
    
       //Input distance in  meters
        System.out.print("Input distance in meters: ");
        double distance = scanner.nextDouble();
        
       // Input btime: hours, minutes,seconds
        System.out.print("Input hour: ");
        int hours = scanner.nextInt();
        
        System.out.print("Input minutes: ");
        int minutes = scanner.nextInt();
           
        System.out.print("Input seconds : ");
        int seconds = scanner.nextInt();
        
        // Convert total time to seconds
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        
        // Calculate speeds
        double metersPerSecond = distance / totalSeconds;
        double kilometersPerHour = (distance / 1000.0) / (totalSeconds / 3600.0);
        double milesPerHour = (distance / 1609.0) / (totalSeconds/ 3600.0);
        
        //Display results
           System.out.printf("Your speed meter/second is %.8f%n" , metersPerSecond);
           System.out.printf("Your speeed in km/h is %.8f%n", kilometersPerHour);
           System.out.printf("Your speed in miles/h is %.8f%n", milesPerHour);
           
       }      
           
           
           
        
        
         
        
    }
    
}
