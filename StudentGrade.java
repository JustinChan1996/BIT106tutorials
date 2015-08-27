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
public class StudentGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        /* This program receives students grades and names and display them in one line */
        System.out.print("Name of student: ");
        String strStudent = input.nextLine();
        System.out.print("Grade: ");
        String strGrade = input.nextLine();
        System.out.println(strStudent + " has a grade of " + strGrade);
    }
    
}
