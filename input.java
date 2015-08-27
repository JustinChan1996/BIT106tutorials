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
public class input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name: ");
        name = in.nextLine();
        System.out.println("Your name is: " + name);
        
        
    }
    
}
