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
public class List_Node <T> {
    
    private T container;            //Contenedor
    private List_Node nextNode;     //Encabezado
    
    public List_Node(T data, List_Node next){       
        //Nodo Intermedio
        this.container = data;
        this.nextNode = next;
    }
    
    public List_Node(T data){       
        //Nodo Final
        this.container = data;
        this.nextNode = null;
    }
    
    //Hay posible Cambio
    public void ChangeNextNode(List_Node next){
        this.nextNode = next;
    }
    
    public List_Node<T> GetNextNode(){
        return nextNode;
    }
    
    public T GetItem(){
        return container;
    }
}
