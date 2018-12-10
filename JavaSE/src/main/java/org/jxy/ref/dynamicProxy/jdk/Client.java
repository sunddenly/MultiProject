package org.hebut.scse.ref.dynamicProxy.jdk;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Properties;

public class Client {
  
    public static void main(String[] args) throws FileNotFoundException, IllegalAccessException, NoSuchFieldException {
        // 添加以下的几段代码, 就可以将代理生成的字节码保存起来了
        Field field = System.class.getDeclaredField("props");
        field.setAccessible(true);
        Properties props = (Properties) field.get(null);
        //设置java虚拟机系统属性，在运行程序的过程中会生成$Proxy0.class文件
        props.put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");//java-basic/com/sun/proxy,默认为当前项目根目录

        // 我们要代理的真实对象
        Subject realSubject = new RealSubject();
        // 我们要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象调用方法的
        InvocationHandler handler = new MethodInvocationHandler(realSubject);
        /*
         * 通过Proxy的newProxyInstance方法来动态创建我们的代理对象，我们来看看其三个参数<
         * 参数一：我们这里使用handler这个类的ClassLoader对象来加载我们的代理对象
         * 参数二：我们这里为代理对象提供的接口是真实对象所实行的接口，表示我要代理的是该真实对象，这样我就能调用这组接口中的方法了
         * 参数三：我们这里将这个代理对象关联到了上方的 InvocationHandler 这个对象上
         */
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(),
                RealSubject.class.getInterfaces(),
                handler);
        System.out.println(proxyInstance.getClass().getName());
        proxyInstance.visit();



    }  
  
}