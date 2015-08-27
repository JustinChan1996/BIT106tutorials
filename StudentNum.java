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
public class StudentNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        /* This program simulates a sentinel loop by asking the user to enter a series of
        student numbers until the user types '0' to end the loop. The number of students a user 
        will enter is recorded.
        */
        Scanner input = new Scanner(System.in);
        /* Initialize variables */
        int i;
        int intStudent;
        /* intialize counter */
        int intCounter = 0;
        do
        {
            System.out.print("Enter Student number (0 to stop): ");
            intStudent = input.nextInt();
            intCounter = intCounter + 1;
        }
        while (intStudent != 0);
        intCounter = intCounter - 1;
        System.out.println("Number of students = " + intCounter);
    }
    
}
