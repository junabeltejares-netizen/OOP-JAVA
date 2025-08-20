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
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int firstnum = sc.nextInt();
        int secondnum = sc.nextInt();
        int a = firstnum * secondnum;
        int b = firstnum + secondnum;
        int c = firstnum / secondnum;
        int d = firstnum - secondnum;
        
        System.out.println(firstnum + " x " + secondnum + " = " + a );
        System.out.println(firstnum + " + " + secondnum + " = " + b );
        System.out.println(firstnum + " / " + secondnum + " = " + c );
        System.out.println(firstnum + " - " + secondnum + " = " + d );
        
    }
    
}
