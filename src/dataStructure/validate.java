/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructure;

import java.util.Stack;

/**
 *
 * @author LeónMejía
 */
public class validate {
    
    
    
    public boolean validate(String chain){
        
        
        Stack<String> stack = new Stack<>();  
       
        for (int i = 0; i < chain.length();i++){
            
            if(chain.charAt(i) == '('){
                stack.push("(");

            }else if(chain.charAt(i) == ')'){
                
                if(!stack.empty()&&stack.peek()=="(")
                {
                 stack.pop();
                 
                }else{
                    stack.push(")");
                }
                
            }
            
             if(chain.charAt(i) == '{'){
                stack.push("{");

            }else if(chain.charAt(i) == '}'){
                
                if(!stack.empty()&&stack.peek()=="{")
                {
                 stack.pop();
                 
                }else{
                    stack.push("}");
                }
                
            }
             
              if(chain.charAt(i) == '['){
                stack.push("[");

            }else if(chain.charAt(i) == ']'){
                
                if(!stack.empty()&&stack.peek()=="[")
                {
                 stack.pop();
                 
                }else{
                    stack.push("]");
                }
                
            }
        }
        
                return stack.empty() ;
    }

   
    
    
    
}
