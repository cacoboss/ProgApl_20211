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
public class Vector3 extends Vector2 {
    public float z;
    
    public Vector3(float x, float y, float z){     
        super(x,y);
        this.z = z;
    }
    
    public Vector3(float x, float y){     
        super(x,y);
        this.z = 0;
    }
    
    @Override
    public String ToString(){
        String s = super.ToString();
        s = s +  " z: " + this.z;
        return s;
    }
    
    @Override
    public float Magnitude(){
        double square = Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2);
        float sqrt = (float)Math.sqrt(square);
        return sqrt;
    }
    
    @Override
    public float Sumar(){
        return x+y+z;
    }
    
    @Override
    public float Restar(){
        return x-y-z;
    }
    
    @Override
    public float Multiplicar(){
        return x*y*z;
    }
    
    @Override
    public float Dividir(){
        return (x/y)/z;
    }
}
