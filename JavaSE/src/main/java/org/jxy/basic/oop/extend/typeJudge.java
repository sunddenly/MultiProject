package org.hebut.scse.basic.oop.extend;

import org.hebut.scse.basic.oop.extend.fc.Child;
import org.hebut.scse.basic.oop.extend.fc.Father;

/**
 * Created by jxy on 2016/8/29.
 */
public class typeJudge {
    public static void main(String[] args) {
        retJudge();
    }

    private static void retJudge() {
        Child c = new Child();

        Child c1 = new Child();
        System.out.println(c.getClass()==c1.getClass());//true

        Father f1 = new Child();
        System.out.println(c.getClass()==f1.getClass());//true

        Father f2 = new Father();
        System.out.println(c.getClass()==f2.getClass());//fasle
    }

    private static void instanceofJudge() {
        String s="";
        int[] array=new int[5];
        Child child = new Child();
        Father father = new Father();
        if(s instanceof String)
            System.out.println(true);//true
        if(s instanceof Object)
            System.out.println(true);//true
        if(array instanceof int[])
            System.out.println(true);//true
        if(array instanceof Object)
            System.out.println(true);//true
        if(child instanceof Child)
            System.out.println(true);//true
        if(child instanceof Father)
            System.out.println(true);//true
        if(father instanceof Father)//true
            System.out.println(true);//true
        if(!(father instanceof Child))//true
            System.out.println(false);//false
    }
}
