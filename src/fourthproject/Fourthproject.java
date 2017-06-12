/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourthproject;

import java.util.Scanner;

/**
 *
 * @author Boro_s99
 */
public class Fourthproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int firstValue = 0;
        System.out.println("Task 1");
        Scanner in = new Scanner(System.in); 
        System.out.println("Please enter weekday number. Week starts at Sunday");
        firstValue = in.nextInt();  
        
        switch (firstValue)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wendnesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;    
            default:
                System.out.println("Saturday");
        }
        
        
        System.out.println("Task 2");
        int temp1 = 0;
        System.out.println("Currency exchange");
        System.out.println("Please enter amount in hryvnas");
        firstValue = in.nextInt();  
        System.out.println("Please enter 1 for dollars, 2 for roubles, 3 for euros");
        temp1 = in.nextInt();
        switch (temp1) {
            case 1:
                System.out.println("Now you have " + firstValue / 25.95 + " dollars");
                break;
            case 2:
                System.out.println("Now you have " + firstValue / 0.456955 + " roubles");
                break;
            case 3:
                System.out.println("Now you have " + firstValue / 29.19 + " euros");
                break;
            
        }
    }
    
}
