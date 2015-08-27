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
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* This program simulates a calculator between 2 integers and performs operations such as
        addition, subtraction, multiplication, division, modulo function and comparision between two integers */
        /* Gather input */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer 1: ");
        int intOne = input.nextInt();
        System.out.print("Enter integer 2: ");
        int intTwo = input.nextInt();
        /* Initialise result variable */
        double dblResult = 0;
        System.out.println("");
        /* Present options to the user */
        System.out.println("What would you like to do?");
        System.out.println("Press");
        System.out.println("+ for total");
        System.out.println("- for difference");
        System.out.println("* for product");
        System.out.println("/ for quotient");
        System.out.println("% for remainder");
        System.out.println("M for larger integer");
        System.out.println("m for smaller integer");
        String empty = input.nextLine();
        /* Asks user's choice */
        System.out.print("Your choice? - ");
        String strChoice = input.nextLine();
        /* Build decision tree based on use's choice */
        switch (strChoice) {
        case "+":
            dblResult = intOne + intTwo;
            System.out.println("Sum: " + dblResult);
            break;
        case "-":
            dblResult = intOne - intTwo;
            /* if result is negative, invert the sign of then difference */
            if (dblResult < 0){
                dblResult = - 1 * (dblResult);
            }
            System.out.println("Difference: " + dblResult);
            break;
        case "*":
            dblResult = intOne * intTwo;
            System.out.println("product: " + dblResult);
            break;
        case "/":
            /* Display error message if one of the variable is 0 */
            if ((intOne != 0) && (intTwo != 0))
            {
                dblResult = intOne / intTwo;
                System.out.println("Quotient: " + dblResult);
            }
            else if (intOne == 0)
            {
                System.out.println("Integer one cannot be zero");
            }
            else if (intTwo == 0)
            {
                System.out.println("Integer two cannot be zero");
            }
            else
            {
                System.out.println("Both integers cannot be zero");
            }
            break;
        case "%":
            /* Display error message if one of the variable is 0 */
            if ((intOne != 0) && (intTwo != 0))
            {
                dblResult = intOne % intTwo;
                System.out.println("Remainder: " + dblResult);
            }
            else if (intOne == 0)
            {
                System.out.println("Integer one cannot be zero");
            }
            else if (intTwo == 0)
            {
                System.out.println("Integer two cannot be zero");
            }
            else
            {
                System.out.println("Both integers cannot be zero");
            }
            break;
        case "M":
            /* This module states which number is bigger */
            if (intOne > intTwo)
            {
                System.out.println("Larger: " + intOne);
            }
            else if (intTwo > intOne)
            {
                System.out.println("Larger: " + intTwo);
            }
            else{
                System.out.println("Both numbers are equal");
            }
            break;
        case "m":
            /* This module states which number is bigger */
            if (intOne < intTwo)
            {
                System.out.println("Smaller: " + intOne);
            }
            else if (intTwo < intOne)
            {
                System.out.println("Smaller: " + intTwo);
            }
            else{
                System.out.println("Both numbers are equal");
            }
            break;
        default:
            System.out.println("Invalid Choice");
            System.out.println("Integers entered: " + intOne + " , " + intTwo);
            break;
        }
    }
}
                    
    
