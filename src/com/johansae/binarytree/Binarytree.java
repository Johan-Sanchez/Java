/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johansae.binarytree;

/**
 *
 * @author LeónMejía
 */
public class Binarytree {
   public nodo raiz;
    
    public Binarytree(){
      this.raiz = null;
    }
    
    public void tourInOrder(nodo x){
        
        if(x != null)
        {
            tourInOrder(x.left);
            System.out.println(x.value);
            tourInOrder(x.right);
        }
    
    }
    
    public void insert(int key, Object value ){
        nodo n = new nodo(key);
        n.value = value;
        
        if(raiz==null){
            raiz = n; 
        }
        else{
            
            nodo temp = raiz;
            while(temp !=null)
            {
                n.p = temp;
                if(n.key>=temp.key)
                {
                    temp = temp.right;
                }
                else
                {
                    temp = temp.left;
                }
            }
            if(n.key<n.p.key)
            {
                n.p.left = n;
            }
            else
            {
                n.p.right = n;
            }
        }
    
    }
    
    public class nodo{
    
        public nodo p; //Father
        public nodo right;
        public nodo left;
        public int key;
        public Object value;
    
    

    
    
    public nodo(int key){
      this.key = key;
      this.right = null;
      this.left = null;
      this.p = null;
      this.value = null;
        
    }
    
    
    }
    
}
