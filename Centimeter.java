/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justin
 */
public class Centimeter {
 
    public static void main(String[] args)
    {
        /* This program accepts cam as the input and returns m and cm as the results */
        int intInput = 120;
        int intMeters = intInput / 100;
        int intCm = intInput % 100;
        System.out.println(intInput + "cm = " + intMeters +"m " + intCm + "cm");
    }
}
