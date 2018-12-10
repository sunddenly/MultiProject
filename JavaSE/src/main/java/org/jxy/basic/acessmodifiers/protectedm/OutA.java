package org.hebut.scse.basic.acessmodifiers.protectedm;

/**
 * Created by jxy on 2016/11/29.
 */
public class OutA {
    public void output(){
        System.out.println(new BaseA().i);//通过父类实例访问protected成员
        System.out.println(new ChildA().i);//通过子类实例访问protected成员
    }
}
