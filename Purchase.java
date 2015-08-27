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
public class Purchase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        /* This program prompts the user to enter the quantity and price and calculates the total price of the objects */
        int intQuantity;
        double dblPrice;
        double dblTotalPrice;
        /* Input quantity */
        System.out.print("Quantity: ");
        intQuantity = input.nextInt();
        /* Input price */
        System.out.print("Price: ");
        dblPrice = input.nextDouble();
        /* Calculate total price */
        dblTotalPrice = intQuantity * dblPrice;
        /* Print total price */
        System.out.println("The total cost of purchase is " + dblTotalPrice);
    }
    
}
