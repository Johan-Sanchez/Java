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
public class nodo<T> {
    
    private T value;
    private nodo<T> next;

    public nodo(T value) {
        
        this.value = value;
        this.next = null;
        
    }

    
    public T getValue() {
        return value;
    }
    
    
    public void linkNext(nodo n){
        this.next = n;
    }

    
    public nodo getNext() {
        
        return next;
    }
    
}
