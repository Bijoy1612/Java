
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eram
 */
public class GenStack<E> {
    private ArrayList<E> list = new ArrayList<>();
    public int getSize(){
        return list.size();
    }
    public boolean isEmpty(){
        return (getSize()==0)?true:false;
    }
    
    public E peek() throws StackEmptyException{
        if(getSize()==0){
            throw new StackEmptyException("STACK IS EMPTY!");
        }
        return list.get(getSize()-1);
    }
    
    public void push(E value){
        list.add(value);
    }
    
    public E pop() throws StackEmptyException{
        E temp = peek();
        if(getSize()==0){
            throw new StackEmptyException("STACK IS EMPTY!");
        }
        list.remove(getSize()-1);
        return temp;
    }
    
}
