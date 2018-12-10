package org.hebut.scse.ref.dynamicProxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * cglib不需要传入ClassLoader,代码里会自己去找上下文的ClassLoader
 */
public class CglibProxy {
    /**
     * 创建代理对象
     * @param target 被代理的对象
     * @return
     */
    public Object getProxyInstance(Object target){

        // 声明增强类实例
        Enhancer enhancer = new Enhancer();
        // 设置被代理类字节码，CGLIB根据字节码生成被代理类的子类
        enhancer.setSuperclass(target.getClass());
        // 设置要代理的拦截器，回调函数，即一个方法拦截   new MethodInterceptor()
        enhancer.setCallback(new CglibInterceptor());
        // 创建代理对象 实例
        return enhancer.create();
    }
}
