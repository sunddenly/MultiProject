package org.hebut.scse.basic.acessmodifiers.protectedm;

/**
 * Created by jxy on 2016/11/29.
 */
public class BaseA {
    protected int i=0;
    public void print(){
        System.out.println(i);//类内可访问
        System.out.println(new BaseA().i);//类内可访问
        new BaseA().print();
    }
}
