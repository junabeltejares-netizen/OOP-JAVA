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
public class Problem5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Input an alphabet :");
        String input = scanner.nextLine();
        
        //Check if input is a single character
        if (input.length() != 1){
            System.out.println("Error: Please enter a single character.");
            return;
        }
        
        char ch = input.charAt(0);
        
        //Check if character is a letter
        if (!Character.isLetter(ch)) {
            System.out.println("Error: Input is not a valid alphabet letter.");
            return;
        }
        //Convert to lowecase for easier comparison
        ch = Character.toLowerCase(ch);
        
        //Check if vowel
        if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is Consonant");
        }
    }
}
