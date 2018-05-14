/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lockers3;

/**
 *
 * @author amandamoreno
 */
public class Lockers3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean lockers [] = new boolean[100];
        boolean open = true;
        boolean closed = false;
        
        for (int i = 0; i < lockers.length; i++) {
            lockers[i]=closed;
        }
        
        int current_student =1;
        
        while (current_student <= 100) {
            for (int i = 0; i < lockers.length; i++) {
                int locker_num = i +1;
                if (locker_num % current_student == 0){
                    lockers[i] = !lockers[i];
                }
        }
            
            current_student++;     
        }
        
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i] == open){
                int l = i+1;
                String message = " Locker " + l + " is open";
                System.out.println(message);
            }
        }
        // TODO code application logic here
    }
    
}
