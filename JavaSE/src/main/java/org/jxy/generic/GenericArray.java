package org.hebut.scse.generic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericArray {
    public static void genericArrayCase(){
        //List<String>[] lsa = new ArrayList<String>[10];//此写法非法，new时不能加<>
        List<String>[] lsa = new ArrayList[10];
        Object[] oa=lsa;

        ArrayList<Integer> lsi = new ArrayList<>();
        lsi.add(new Integer(3));
        oa[1]=lsi;

        String s = lsa[1].get(0);//类型转换异常
    }
    public  <T> T[] makeArray(Collection<T> c){
        return (T[])new Object[c.size()];
    }
    @SuppressWarnings("unchecked")
    public static  <T extends Comparable<T>> void getMin(T[] a) {
        T[] b = (T[]) Array.newInstance(a.getClass().getComponentType(),
                a.length);
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        T min = null;
        boolean flag = true;
        for (int i = 0; i < b.length; i++) {
            if (flag) {
                min = b[i];
                flag = false;
            }
            if (b[i].compareTo(min) < 0) {
                min = b[i];
            }
        }
        System.out.println(min);
    }
    public static <T> T[] newInstance(Class<T> ComponentType, int length){
        return (T[])Array.newInstance(ComponentType, length);
    }
    public static void main(String[] args) {
        String [] objects = newInstance(String.class, 10);
    }
}
