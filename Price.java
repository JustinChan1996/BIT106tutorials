/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justin
 */
public class Price {
    public static void main(String[] args)
    {
        /* This program calculates the price of an item after 10 percent discount */
        double dblPrice = 250.50;
        double dblDiscount = 10.0;
        double dblDiscountPrice = ((dblPrice * ((100 - dblDiscount)/ 100)));
        System.out.println("The original price of the item is "+ dblPrice);
        System.out.println("The price of the item after 10 percent discount is "+dblDiscountPrice);
        
    }
}
