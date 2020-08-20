/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johansae.linkedlist;

/**
 *
 * @author LeónMejía
 */
public class linkedlist<T>  {
    
    private nodo<T> first;
    private  int size;
    
    public linkedlist() {
        
        this.first = new nodo<>(null);
        this.size = 0;
    } 
    
    
    public void add(T object){
    
       
        if(first==null){
            
            first = new nodo<> (object);
            
        }else {
            
            nodo<T> aux = first;
            nodo<T> nuevo = new nodo<> (object);
            aux.linkNext(nuevo);
            first = aux;
        }
        size++;
    }
    
    public T obtain(int index){
        int accountant = 0;
        nodo<T> aux = first;
        while(accountant < index){
            
            aux = aux.getNext();
            accountant++;
        
        }
        
        return aux.getValue();
    
    }
    
    public int size(){
    
        return size;
    }
    
    
    public boolean empty(){
    
        if(first==null){
            return true;
        }else {
            return false;
        }
    }
    
}
