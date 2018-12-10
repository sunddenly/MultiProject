package org.hebut.scse.basic.oop.extend;

import org.hebut.scse.basic.oop.extend.fc.Child;
import org.hebut.scse.basic.oop.extend.fc.Father;
import org.hebut.scse.basic.oop.extend.fru.Apple;
import org.hebut.scse.basic.oop.extend.fru.Fruit;
import org.hebut.scse.basic.oop.extend.fru.Jonathan;
import org.hebut.scse.basic.oop.extend.fru.Orange;
import org.hebut.scse.design.create.protype.serializable.Car;
import org.hebut.scse.design.create.protype.serializable.CloneUtil;
import org.hebut.scse.design.create.protype.Person;

/**
 * Created by jxy on 2016/8/29.
 */
public class swap {
    public static void main(String[] args) throws Exception {
        fruSwap();
    }

    private static void fruSwap() {
        Fruit[] fruit = new Fruit[10];
        fruit[0] = new Apple();
        fruit[1] = new Jonathan();
        fruit[2] = new Orange();
        Apple a=(Apple)fruit[0];//ok
        Jonathan b = (Jonathan)fruit[1];//ok

        Orange c = (Orange)fruit[2];//ok
        Jonathan d = (Jonathan)fruit[0];//失败，即使Jonathan extends Apple
    }

    private static void fcSwap() throws Exception {
        Child c = new Child();
        //子类型到父类型
        Father f1 = new Child();//多态性质的父类型
        Father f2=c;

        Father f3 = new Father();//真正的父类型
        //父类型到子类型
        Child c1 =(Child)f1;//多态性质的父类型,正常运行
        //Child c2 =(Child)f3;//真正的父类型，编译没错，运行时出错
        //可不可转换，还是主要看引用所指向的实例内容
        Person p1 = new Person("Hao LUO", 33, new Car("Benz", 300));
        Child p3 = (Child) CloneUtil.clone2(f1);
        Child father1 = (Child)f1.getClass().newInstance();
        Child father2 = (Child)f2.getClass().newInstance();
        System.out.println(father1);
        System.out.println(father2);
    }
}
