/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectors;

/**
 *
 * @author ciro_
 */
public class Vector2 implements Operaciones{
    float x;
    float y;
    
    public Vector2(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    public float Magnitude(){
        double square = Math.pow(x, 2) + Math.pow(y, 2);
        float sqrt = (float)Math.sqrt(square);
        return sqrt;
    }
    
    @Override
    public String ToString(){
        String s;
        if(this.x == null && this.y == null)
             return "Vector Vacio";
        
        try{
            s = "Vector x: " + this.x + "y: " + this.y;
        }catch(NullPointerException ex){
           
        }
        
        return s;
    }
    
    @Override
    public float Sumar(){
        return x+y;
    }
    
    @Override
    public float Restar(){
        return x-y;
    }
    
    @Override
    public float Multiplicar(){
        return x*y;
    }
    
    @Override
    public float Dividir(){
        return x/y;
    }
    
    
}
