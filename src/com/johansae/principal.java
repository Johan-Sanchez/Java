/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johansae;

import com.johansae.binarytree.Binarytree;
import com.johansae.linkedlist.linkedlist;
import dataStructure.validate;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import java.util.Stack;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import java.util.stream.Stream;




/**
 *
 * @author LeónMejía
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         
       /*Nodo one = new Nodo(12.36);
        Nodo two= new Nodo("Hello");
        
        one.linkNext(two);
        
        System.out.println(one.getNext().getValue());*/
        
        /*linkedlist<String> one = new linkedlist<>();
        
        one.add("Testing generics java");
        one.add("Second element");
        one.add("Hi");
        
        System.out.println(one.obtain(0));
        
        for (int i = 0; i < one.size(); i++) {
            
            System.out.println(one.obtain(i));
            
        } */
        
        /*Binarytree tree = new Binarytree();
        
        tree.insert(1,"Hola que mas");
        tree.insert(3,"hi");
        tree.insert(7,"Hello");
        tree.insert(5,"Hablame");
        tree.insert(4,"diemlo");
        
        tree.tourInOrder(tree.raiz);
         
         
        
        List a = new LinkedList();
        
        a.add("holis");
        
        System.out.println(a.get(0));*/
        
      
        //validate chain = new validate(" [] Hello what else here learning a little (data structure)");
   
        
       // System.out.println("Is the chain balanced? -----> "+chain.validate());
        
       List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

       
        
       numbers.stream()
        .filter(number -> number % 2 == 0)
        .map((Integer number) -> number * 2)
        .collect(Collectors.toList())
        .forEach((x) -> System.out.println(x));
        
        
        
     
     }
    
       
        
       
    }

    
    
    
       

