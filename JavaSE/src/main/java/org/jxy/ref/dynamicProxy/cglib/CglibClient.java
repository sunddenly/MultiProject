package org.hebut.scse.ref.dynamicProxy.cglib;


public class CglibClient {
      public static void main(String[] args) {
        //System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, ".\\src");//保存生成的字节码文件
        CglibProxy proxy = new CglibProxy();
        CglibRealSubject realSubject = (CglibRealSubject) proxy.getProxyInstance(new CglibRealSubject());
        realSubject.visit();  
    }  
}