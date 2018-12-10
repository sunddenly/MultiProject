package com.elong.design.pattern.ch07proxy;

import com.elong.design.pattern.ch07proxy.pojo.RealSubject;
import com.elong.design.pattern.ch07proxy.pojo.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Subject proxy = DynProxyFactory.getInstance();
        proxy.dealTask("DBQueryTask");
    }
}
class DynProxyFactory {
    //客户类调用此工厂方法获得代理对象。
    //对客户类来说，其并不知道返回的是代理类对象还是委托类对象。
    public static Subject getInstance(){
        Subject delegate = new RealSubject();
        InvocationHandler handler = new SubjectInvocationHandler(delegate);
        Subject proxy = null;
        proxy = (Subject) Proxy.newProxyInstance(
                delegate.getClass().getClassLoader(),
                delegate.getClass().getInterfaces(),
                handler);
        return proxy;
    }
}

class SubjectInvocationHandler implements InvocationHandler {

    //代理类持有一个委托类的对象引用
    private Object delegate;
    public SubjectInvocationHandler(Object delegate) {
        this.delegate = delegate;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)throws Throwable {
        long stime = System.currentTimeMillis();
        //利用反射机制将请求分派给委托类处理。Method的invoke返回Object对象作为方法执行结果。
        //因为示例程序没有返回值，所以这里忽略了返回值处理
        method.invoke(delegate, args);
        long ftime = System.currentTimeMillis();
        System.out.println("执行任务耗时"+(ftime - stime)+"毫秒");
        return null;
    }
}

