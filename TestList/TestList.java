/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestList;

import ListBase.*;
import Vectors.*;
import Lista.Lista;

/**
 *
 * @author ciro_
 */
public class TestList {
    public static void main(String[] args){
        
        NodeLinked_List<Vector2> list = new NodeLinked_List<>();
        NodeLinked_List<Vector3> list3 = new NodeLinked_List<>();
        
        list.AddObject(new Vector2(1f,1f));
        list.AddObject(new Vector2(2f,2f));
        list.AddObject(new Vector2(3f,3f));
        
        Lista<Vector3> listaNueva = new Lista<>();
        listaNueva.AgregarElemento(new Vector3(1f,1f));
        listaNueva.AgregarElemento(new Vector3(1f,1f));
        
        ArrayLinked_List<Vector2> otraLista = new ArrayLinked_List<>();
        otraLista.AddObject(new Vector3(1f,1f, 0f));
        otraLista.AddObject(new Vector3(1f,1f, 45f));
        otraLista.AddObject(new Vector3(1f,1f, 85f));
        
        System.out.println(list.GetObjectAtIndex(-1).ToString());
        System.out.println(otraLista.GetObjectAtIndex(3).ToString());
    }
}
