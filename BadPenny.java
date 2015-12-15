/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package badpenny;

import java.util.Random;

/**
 *
 * @author Primary
 */
public class BadPenny {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        boolean penny;  
        Random randy = new Random();
        int flips = randy.nextInt(11) + 10;
        
        System.out.println("Welcome to Bad Penny Date!");
        System.out.println("Your magic number is " + flips + ".");
        System.out.println();
        System.out.println("To play, begin driving with your date in any direction.");
        System.out.println("When you come to a junction, turn the direction printed");     
        System.out.println("below until you are out of turns. This is where your date will be.");
        System.out.println("It's that simple!!");
        System.out.println();
        
        for(int i = 0; i < flips; i++){
            penny = randy.nextBoolean();
            
            
            if(penny){
                    System.out.println(i+1 + ". Turn Left");
                }else{System.out.println(i+1 + ". Turn Right");}
                    
              
        }
        
    }
    
}
