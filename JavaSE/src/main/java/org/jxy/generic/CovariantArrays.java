package org.hebut.scse.generic;

import org.hebut.scse.basic.oop.extend.fru.Apple;
import org.hebut.scse.basic.oop.extend.fru.Fruit;
import org.hebut.scse.basic.oop.extend.fru.Jonathan;
import org.hebut.scse.basic.oop.extend.fru.Orange;

public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple(); // OK
        fruit[1] = new Jonathan(); // OK
//        fruit[2] = new Orange(); // 失败
        Fruit f = new Orange();
        Apple a=(Apple)new Fruit();
        Jonathan b = (Jonathan) fruit[0];//Apple==>Jonathan 成功
//        Apple a = (Apple) f;//Orange==>Apple 失败
    //    // Runtime type is Apple[], not Fruit[] or Orange[]:
    //    try {
    //    // Compiler allows you to add Fruit:
    //        fruit[0] = new Fruit(); // ArrayStoreException
    //    } catch(Exception e) { System.out.println(e); }
    //    try {
    //    // Compiler allows you to add Oranges:
    //        fruit[0] = new Orange(); // ArrayStoreException
    //    } catch(Exception e) { System.out.println(e); }
    //    }
    }
}