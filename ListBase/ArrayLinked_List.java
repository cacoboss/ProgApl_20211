/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListBase;

/**
 *
 * @author ciro_
 */
public class ArrayLinked_List <T>
    implements I_LinkedList<T>{
    
    
    private int size;
    private T[] elements;
    
    private final int initialArrayCapacity = 2;
    
    public ArrayLinked_List(){
        size = 0;
        elements = (T[]) new Object[initialArrayCapacity];
    }
    
    /* ------
    *   Metodos de la Interfaz
    */ 
    
    @Override
    public void AddObject(T objectToAdd){
        if(size == elements.length){
            T[] newElements = (T[]) new Object[elements.length *  2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        
        elements[size] = objectToAdd;
        size++;
    }
    
    @Override
    public int GetSize(){
        return size;
    }
    
    @Override
    public T GetObjectAtIndex(int index){
        return elements[index];
    }
}
