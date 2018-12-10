package com.elong.design.pattern.ch07proxy;

import com.elong.design.pattern.ch07proxy.pojo.RealSubject;
import com.elong.design.pattern.ch07proxy.pojo.Subject;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDemo {
    public static void main(String[] args) {
        Subject userService = (Subject) MyProxyFactory.createUserService();
        userService.dealTask("12");

    }
}
class MyProxyFactory {
    public static Object createUserService() {
        //目标类
        Subject subject = new RealSubject();
        Enhancer enhancer=new Enhancer();
        //确定父类
        enhancer.setSuperclass(RealSubject.class);
        /*
         *  设置回调函数 MethodInterceptor接口等效于jdk invocationHandler接口
         *  intercept()等效于jdk invoke()
         *  参数1 ，参数2，参数3 和invoke三个参数一样
         *  参数4，methodProxy  方法代理
         */
        enhancer.setCallback(new SubMethodInterceptor(subject));
        Object proxy=enhancer.create();
        return proxy;
    }
}

class SubMethodInterceptor implements MethodInterceptor {
    //代理类持有一个委托类的对象引用
    private Object delegate;

    public SubMethodInterceptor(Object delegate) {
        this.delegate = delegate;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        long stime = System.currentTimeMillis();
        //利用反射机制将请求分派给委托类处理。Method的invoke返回Object对象作为方法执行结果。
        //因为示例程序没有返回值，所以这里忽略了返回值处理
        method.invoke(delegate, args);
        long ftime = System.currentTimeMillis();
        System.out.println("执行任务耗时"+(ftime - stime)+"毫秒");
        return null;
    }
}