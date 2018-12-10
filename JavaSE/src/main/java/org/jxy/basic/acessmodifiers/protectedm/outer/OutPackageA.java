package org.hebut.scse.basic.acessmodifiers.protectedm.outer;

import org.hebut.scse.basic.acessmodifiers.protectedm.BaseA;
import org.hebut.scse.basic.acessmodifiers.protectedm.ChildA;

/**
 * Created by jxy on 2016/11/29.
 */
public class OutPackageA extends BaseA{
    public void output(){
        System.out.println(i);
       //System.out.println(new BaseA().i);//通过父类实例访问protected成员,失败
        //System.out.println(new ChildA().i);//通过子类实例访问protected成员，实例
    }
}
