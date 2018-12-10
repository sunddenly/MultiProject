package org.hebut.scse.ref.dynamicProxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibInterceptor implements MethodInterceptor {
    private Object target;
    @Override  
    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy proxy) throws Throwable {
        // 在代理真实对象操作前 我们可以添加一些自己的操作  
        System.out.println("前置代理,增强处理");  
          
        proxy.invokeSuper(obj, args);  
          
        // 在代理真实对象操作后 我们也可以添加一些自己的操作  
        System.out.println("后置代理,增强处理");  
        return null;  
    }  
  
}