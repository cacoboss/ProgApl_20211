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
public class ArrayLinked_List <T> implements I_LinkedList<T>{
    
    
    private int size;
    private T[] elements;
    
    private final int initialArrayCapacity = 2;
    
    public ArrayLinked_List(){
        size = 0;
        elements = (T[]) new Object[initialArrayCapacity];
    }
    
    // ==================
    // Metodos de I_LinkedList
    // ==================
    
    @Override
    public boolean IsEmpty(){
        return size > 0;
    }
    
    @Override
    public int GetSize(){
        return size;
    }
    
    @Override
    public void AddObject(T objectToAdd){
        if(size == elements.length){
            T[] newElements = (T[]) new Object[elements.length *  2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        
        if(size ==0){
            elements[0] = objectToAdd;
        }else{
            elements[size] = objectToAdd;
            
        }
        size++;
    }
    
    @Override
    public void AddObject(T obj, int index){
        if(size == elements.length){
            T[] newElements = (T[]) new Object[elements.length *  2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        
        if(index >= size-1){
            elements[size-1] = obj;
            size++;
        }
        
        if(index < size-1){
            for(int i = size-1; i < index; i--){
                if(i == index)
                    elements[i] = obj;
                else
                    elements[i+1] = elements[i];
            }
            size++;
        }
    }
    
    @Override
    public T GetObjectAtIndex(int index){
        return elements[index];
    }
    
    @Override
    public T RemoveObject(){
        T obj = elements[size];
        elements[size] = null;
        size--;
        
        return obj;
    }
    
    public T RemoveObject(boolean b){
        T obj = elements[0];
        elements[0] = null;
        for(int i = 1; i < size; i++){
            elements[i-1]=elements[i];
        }
        size--;
        
        return obj;
    }
    
    @Override
    public T RemoveObject(int index){
        T obj = elements[index];

        //Delete the Object
        elements[index] = null;
        
        //   0  1 {2} 3  4  5  6
        /// [1, 2, 5, 9, |, |, |];
        for(int i = index+1; i < size; i++){
            elements[i-1]=elements[i];
            //elements.length;
        }
        elements[size] = null;
        size--;
        
        return obj;
    }
    
    @Override
    public int IndexOf(T obj){
        int result = -1;
        for(int i = 0; i < size; i++){
            if(elements[i].equals(obj) ){
                result = i;
                break;
            }
        }
        return result;
    }
    
    
    // public int[] IndexesOf(T Obj);
    
}
