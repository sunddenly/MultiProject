package org.hebut.scse.ref.classloader.resource.classpath;


import java.io.File;
import java.util.Random;

/**
 * Created by jxy on 2016/11/27.
 */
public class LoadSource {
    public static void main(String[] args) {

    }

    private static void SystemSource() {
        System.out.println(new File("").getAbsolutePath());//默认路径,当前项目根路径
        System.out.println(new File("/").getAbsolutePath());//文件系统根路径
        System.out.println(new File("./com").getAbsolutePath());//当前项目下的com路径
        System.out.println(new File("F:\\Project\\BasicProject\\java-basic\\com\\sun\\$Proxy0.class").getAbsolutePath());//文件系统根路径
    }

    private static void classpathSource() {
        System.out.println("class-\"\": "+LoadSource.class.getResource(""));//默认加载路径
        System.out.println("class-.: "+LoadSource.class.getResource("."));//当前类的类路径
        System.out.println("class-/: "+LoadSource.class.getResource("/"));//classpath的根路径
        System.out.println("class-../: "+LoadSource.class.getResource("../"));//当前类的类路径的上级
        System.out.println("class-load: "+LoadSource.class.getResource("LoadClassPathSource.class"));//加载当前类
        System.out.println("class-../load: "+LoadSource.class.getResource("/org/hebut/scse/ref/classloader/resource/classpath/LoadClassPathSource.class"));//加载当前类从根路径加载当前类

        System.out.println("=======================================================");
        System.out.println(LoadSource.class.getClassLoader().getResource(""));//默认加载路径，根路径
        System.out.println(LoadSource.class.getClassLoader().getResource("."));//类加载器当前路径，根路径
        System.out.println(LoadSource.class.getClassLoader().getResource("/"));//非法
        System.out.println(LoadSource.class.getClassLoader().getResource("org/hebut/scse/ref/classloader/resource/classpath/LoadClassPathSource.class"));
        LoadSource.class.getClassLoader().getResource("");
    }
}
