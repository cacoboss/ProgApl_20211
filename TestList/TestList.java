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
        
        
        ArrayLinked_List<Vector2> otraLista = new ArrayLinked_List<>();
        
        otraLista.AddObject(new Vector3(465f,1f, 0f));
        otraLista.AddObject(new Vector3(1f,2f, 0f));
        otraLista.AddObject(new Vector3(1f,1f, 0f));
        System.out.println(otraLista.IndexOf(new Vector3(1f,1f, 0f)));
                
        otraLista.AddObject(new Vector3(1f,1f, 45f));
        otraLista.AddObject(new Vector3(1f,1f, 85f));
        
        //System.out.println(list.GetObjectAtIndex(-1).ToString());
        //System.out.println(otraLista.GetObjectAtIndex(3).ToString());
    }
}
