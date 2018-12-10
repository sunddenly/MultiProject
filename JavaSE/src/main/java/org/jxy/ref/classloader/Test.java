package org.hebut.scse.ref.classloader;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/**
 * Created by jxy on 2016/10/10.
 */
public class Test {
    //定义一个主方法
    public static void main(String[] args) throws Exception {//java CompileClassLoader Hello 蒋新宇

        //如果运行该程序时没有参数，即没有目标类
        if (args.length < 1) {
            System.out.println("缺少运行的目标类，请按如下格式运行Java源文件：");
            System.out.println("java CompileClassLoader ClassName");
        }
        //第一个参数是需要运行的类
        String progClass = args[0];//Hello.java
        //剩下的参数将作为运行目标类时的参数，所以将这些参数复制到一个新数组中
        String progArgs[] = new String[args.length - 1];// 蒋新宇
        System.arraycopy(args, 1, progArgs, 0, progArgs.length);
        //启动CompileClassLoader加载器


        CompileClassLoader ccl = new CompileClassLoader();
        //加载需要运行的类
        Class<?> clazz = ccl.loadClass(progClass);
        //获取需要运行的类的主方法
        Method main = clazz.getMethod("main", (new String[0]).getClass());
        Object argsArray[] = {progArgs};
        main.invoke(null, argsArray);
    }
}
