/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justin
 */
public class time {
    
    public static void main(String[] args)
    {
        /* This program accepts seconds as the input and calculates its corresponding hours, minutes and seconds */
        /* intInput is the input variable */
        int intInput = 3600;
        /* intLimit is the sexagesimal limit for each unit of time which is 60 */
        int intLimit = 60;
        /* Calculate the number of minutes */
        int intMin = intInput / intLimit;
        /* Calculate the remaining seconds */
        int intRemainSeconds = intInput % 60 ;
        /* Calculate the number of hours */
        int intHours = intMin / intLimit;
        /* Calculate the remaining Minutes; */
        int intRemainMinutes = intMin % 60;
        /* Print output */
        System.out.println(intInput + " seconds = " + intHours + " hours " + intRemainMinutes + " minutes " + intRemainSeconds + " seconds " );
    }
    
}
