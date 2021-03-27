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
    
    
    // ==================
    // Metodos de I_LinkedList
    // ==================
    
    @Override
    public boolean IsEmpty(){
        return count > 0;
    }
    
    @Override
    public int GetSize(){
        return count;
    }
        
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
    public void AddObject(T obj, int index){
        List_Node<T> temp = new List_Node<>(null);
        List_Node<T> nodeToAdd = new List_Node<>(obj);
        
        if(index == 0){
            nodeToAdd.ChangeNextNode(this.startNode);
            this.startNode = nodeToAdd;
            count++;
        }
        
        if(index >= count -1){
            this.lastNode.ChangeNextNode(nodeToAdd);
            count++;
        }
        
        if(index > 0 ) { 
            
            for(int i = 0 ; i <= index-1; i++){
                if(i == 0){
                    temp = startNode;
                }else{
                    temp = temp.GetNextNode();
                }
            } 
            nodeToAdd.ChangeNextNode(temp.GetNextNode());
            temp.ChangeNextNode(nodeToAdd);
            count++;
        }
    }
    
    
    @Override
    public T GetObjectAtIndex(int index){
        List_Node<T> temp = new List_Node<>(null);
        T item = null;
        
        if(index < 0 || index >= count)     //Manejo de Excepciones
            return item;
        
        for(int i = 0 ; i <= index; i++){
            if(i == 0){
                temp = startNode;
            }else{
                temp = temp.GetNextNode();
            }
        }

        return temp.GetItem();
    }
    
    @Override
    public T RemoveObject(){
        T obj = lastNode.GetItem();
        
        List_Node<T> temp = new List_Node<>(null);
        for(int i=0; i<count-1;i++){
            if(i == 0){
                temp = startNode;
            }else{
                temp = temp.GetNextNode();
            }
        }
        
        temp.ChangeNextNode(null);
        lastNode = temp;
        count--;
        
        return obj;
    }
    
    @Override
    public T RemoveObject(int index){
        //   x +
        //[0 1 2 3]
        
        List_Node<T> temp1 = new List_Node<>(null);
        List_Node<T> temp2 = new List_Node<>(null);
        T obj = null;
        
        if(index == 0){
            startNode = startNode.GetNextNode();
        }else{
            for(int i=0; i<index-1;i++){
                if(i == 0){
                    temp1 = startNode;
                    temp2 = temp1.GetNextNode();
                }else{
                    temp1 = temp1.GetNextNode();
                    temp2 = temp1.GetNextNode();
                }
            }
            obj = temp2.GetItem();
            temp1.ChangeNextNode(temp2.GetNextNode());
        }
        count--;
        return obj;
        //nodeToAdd.ChangeNextNode(temp.GetNextNode());
            //temp.ChangeNextNode(nodeToAdd);
           // count++;
        
    }
    
    @Override
    public int IndexOf(T obj){
        int result = -1;
        T compare;
        
        List_Node<T> temp1 = new List_Node<>(null);
        for (int i = 0; i < count ; i++){
            if(i==0){
                temp1 = startNode;
                compare = temp1.GetItem();
            }else{
                temp1 = temp1.GetNextNode();
                compare = temp1.GetItem();
            }
            if(compare.equals(obj)){
                result = i;
                break;
            }
        }
        
        return result;
    }
}
