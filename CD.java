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
public class CD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        /* This program Calculates the price of the CD-R disks bought by the customer and gives discounts based on the volume */
        /* If the quantity of the CDs is between 6 and 20, 10 percent discount will be given */
        /* If the quantity of the CDs is more than 20, 15 percent discount will be given */
        /* Prompts the user for quantity */
        System.out.print("Quantity of CD-R disks? ");
        int intQuantity = input.nextInt();
        /* Price of each CD is RM5.80 */
        double dblPrice = 5.80;
        /* Calculate cost variable */
        double dblCost = intQuantity * dblPrice;
        double dblDiscount ;
        /* Checks quantity, if it is negative, display error message */
        if(intQuantity > 0){
            /* If the quantity is between 6 and 20, discount 10 percent */
            if((intQuantity >= 6) && (intQuantity <= 20)){
                dblDiscount = 0.1 * dblCost;
                dblCost = dblCost - dblDiscount;
            /* If the quantity is above 20, discount 15 percent */
            }
            else if (intQuantity > 20)
            {
                dblDiscount = 0.15 * dblCost;
                dblCost = dblCost - dblDiscount;
            }
            else {
                dblDiscount = 0;
            }
            /* print output data */
            System.out.println("Unit Price: RM" + dblPrice);
            System.out.println("Quantity bought: " + intQuantity);
            System.out.println("Discount: RM" + dblDiscount);
            System.out.println("Amount paid: RM" + dblCost);
        }
        else
        {
            System.out.println("Invalid Quantity");
        }
        
        
        
            
            
        
    
        
    }
    
}
