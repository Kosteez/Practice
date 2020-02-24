/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Costa Korres
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Jeremy is an idiot :)    ");
        
        int a = 5;
        int b = 5;
        String result;
        result = String.valueOf(a==b);
        
        System.out.println(result);
        System.out.println(a!=b);
        System.out.println(a==b);
        
        System.out.println();
        System.out.println("Relationship: a<b " + (a<b));
        System.out.println("Relationship: a<=b " + (a<=b));
        System.out.println("Relationship: a>b " + (a>b));
        System.out.println("Relationship: a>=b " + (a>=b));
        
        System.out.println();
        System.out.println("Logical: !(a<=b) " + !(a<=b));
        System.out.println("Logical: T && T " + ((a==b) || true));
        System.out.println("Logical: T && F " + (true || false));
        System.out.println("Logical: T && T " + ((a!=b) || true));
        System.out.println("Logical: T && T " + (true || true));
        System.out.println("Logical: T && T " + (true || false));
        System.out.println("Logical: T && T " + (false || false));
        
        System.out.println();
        a = 2;
        if (a<b) {
            System.out.println("a is less then b");
            if (a==2)
                System.out.println("a is equal to 2");
        } else if (a<0){
            System.out.println("a is less then zero");
        } else {
            System.out.println("a is NOT less than b nor than zero");
        }
        System.out.println("Outside the if ");
                
        System.out.println("Conditional operator");
      
        result = (a==b)?"Yes of course it is TRUE":"No of course it is FALSE";
        
        System.out.println("Is a equal to b? " + (a==b));
        System.out.println("Is a equal to b? " + result);
        
        
      
        
    }
    
}
