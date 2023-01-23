
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eram
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        try {
            GenStack<Double> mystack = new GenStack<>();
            mystack.push(33.45);
            mystack.push(41.23);
            mystack.push(21.0);
            mystack.push(18.33);
            System.out.println(mystack.peek());
            System.out.println(mystack.pop());
            System.out.println(mystack.pop());
            System.out.println(mystack.pop());
            System.out.println(mystack.isEmpty());
            System.out.println(mystack.pop());
            System.out.println(mystack.pop());
        } catch (StackEmptyException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
