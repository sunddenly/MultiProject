package org.hebut.scse.ref.dynamicProxy.jdk;

public class RealSubject implements Subject {  
      @Override
    public void visit() {  
         System.out.println("I am 'RealSubject',I am the execution method");  
    }  
  
}