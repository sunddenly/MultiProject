package org.hebut.scse.basic.acessmodifiers.protectedm;

/**
 * Created by jxy on 2016/11/29.
 */
public class ChildA extends BaseA{
    public void output(){
        System.out.println(i);//直接访问父类protected成员
        System.out.println(new BaseA().i);//通过父类实例访问protected成员
        System.out.println(new ChildA().i);//通过子类实例访问protected成员
    }
}
