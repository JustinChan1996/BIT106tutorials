/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justin
 */
import java.util.Scanner;
public class CompareNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* This program compares 2 numbers entered by the user and compare their relationship */
        Scanner input = new Scanner(System.in);
        /* Accepts 2 numbers */
        System.out.print("Enter first number: ");
        int intNum1 = input.nextInt();
        System.out.print("Enter Second number: ");
        int intNum2 = input.nextInt();
        /* Check the relationship between two numbers */
        if (intNum1 > intNum2)
        {
            System.out.println("First number is greater than second number");
        }
        else if (intNum2 > intNum1)
        {
            System.out.println("Second number is greater than second number");
        }
        else
        {
             System.out.println("First number is equal to second number");
        }
        
    }
    
}
