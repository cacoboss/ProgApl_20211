/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestList;

import ListBase.Linked_List;
import Vectors.*;
import Lista.Lista;

/**
 *
 * @author ciro_
 */
public class TestList {
    public static void main(String[] args){
        
        Linked_List<Vector2> list = new Linked_List<>();
        Linked_List<Vector3> list3 = new Linked_List<>();
        
        list.AddObject(new Vector2(1f,1f));
        list.AddObject(new Vector2(2f,2f));
        list.AddObject(new Vector2(3f,3f));
        
        Lista<Vector3> listaNueva = new Lista<>();
        listaNueva.AgregarElemento(new Vector3(1f,1f));
        listaNueva.AgregarElemento(new Vector3(1f,1f));
    }
}
