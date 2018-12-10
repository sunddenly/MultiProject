package org.hebut.scse.generic;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class GenericErasure {
    public static void erasureVolidate(){
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        Class c3 = new ArrayList().getClass();
        System.out.println(c1 == c2);//true
        System.out.println(c1 == c3);//true
        System.out.println(c1.getName());//ArrayList
        int[] c = new int[5];
        System.out.println(c.getClass().getComponentType());
    }
    public static void reflectVolidate() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);//这样调用add方法只能存储整形，因为泛型类型的实例为Integer
        list.getClass().getMethod("add", Object.class).invoke(list, "asd");//反射调用擦除后的方法
        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args) {
        erasureVolidate();
    }
}