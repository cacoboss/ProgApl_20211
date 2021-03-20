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
public class NodeLinked_List <T> implements I_LinkedList<T> {
    private int count;          //Cuantos Elementos Tengo
    private List_Node <T> startNode;        //Nodo Inicio
    private List_Node <T> lastNode;
    
    public NodeLinked_List(){
        this.count = 0;
        this.startNode = null;
    }
    
    //Metodos de I_LinkedList
    @Override
    public void AddObject(T obj){
        if(count == 0){
            startNode = new List_Node <T> (obj);
            lastNode = startNode;
            count++;
        }else{
            List_Node<T> node = new List_Node<>(obj);
            this.lastNode.ChangeNextNode(node);
            this.lastNode = node;
            count++;
        }
    }
    
    @Override
    public int GetSize(){
        return count;
    }
}
