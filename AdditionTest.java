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
import java.lang.Math;
public class AdditionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* This program prompts an addition test to the user and tells the user 
        if the answer is correct or not. The two addition variables are generated by
        a random number generator.
        */
        Scanner input = new Scanner(System.in);
        /* Generate two random numbers to test the user */
        int i;
        /* Generate correct answer counter. The counter will be incremented when a correct
        answer is inputted by the user
        */
        int intCounter = 0;
        for (i = 0; i < 10; i = i + 1)
        {
            int intFirst =  (int)(Math.random()* 10);
            int intSecond = (int)(Math.random() * 10);
            int intCorrect = intFirst + intSecond;
            /*Display prompt to the user */
            System.out.print("What is " + intFirst + " + " + intSecond + "? ");
            /*Gather answer from the user */
            int intAns = input.nextInt();
            if (intAns != intCorrect){
                System.out.println("Oops, the correct answer is " + intCorrect);
            }
            else
            {
                System.out.println("Your answer is correct! ");
                intCounter = intCounter + 1;
            }
        }
        System.out.println("Your score is " + intCounter);
        /* Display the appropriate message based on the user's score */
        if (intCounter <= 4)
        {
            System.out.println("Please consult your teacher for revision!");
        }
        else if (intCounter > 4 && intCounter <=6 )
        {
            System.out.println("Please revise your works.");
        }
        else if (intCounter > 6 && intCounter <= 8)
        {
            System.out.println("Keep it up! ");
        }
        else
        {
            System.out.println("Excellent! ");
        }
        
    }
}
