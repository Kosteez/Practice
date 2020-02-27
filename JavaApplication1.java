/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author cstuser
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner(System.in);
        
        String greeting = "";
        int choice;
    
        System.out.println("Please chooose one of the options: ");
        System.out.println("(1) Happy birthday");
        System.out.println("(2) Good morning");
        System.out.println("(3) Cheers");
        System.out.println("(4) Hi there");
        System.out.println("(5) Hello");
        
        choice = scan.nextInt();
        
        System.out.println("The greeting you selected was: " + choice);
        
        switch(choice){
            case 1 : 
                greeting = "Happy birthday!";
                break;
            case 2 : 
                greeting = "Good morning!";
                break;
            case 3 : 
                greeting = "Cheers!";
                break;
            case 4 : 
                greeting = "Hi there!";
                break;
            case 5 : 
                greeting = "Hello!";
                break;
            default : 
                greeting = "INVALID JEREMIAH YOU FKN LOSER!";
        }
        
        System.out.println();
        System.out.println(greeting);
        
        if (choice==1) {
            greeting = "happy birthday! loser";
        } else if (choice==2) {
            greeting = "Good morning! loser";
        } else if (choice==3) {
            greeting = "Cheers! loser";
        } else if (choice==4) {
            greeting = "Hi there! loser";
        } else if (choice==5) {
            greeting = "Hello! loser";
        } else {
            greeting = "INVALID loser";
        }
        System.out.println(greeting);
        
        
        
    }
    
}
