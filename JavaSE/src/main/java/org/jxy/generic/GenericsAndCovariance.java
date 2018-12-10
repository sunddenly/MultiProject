package org.hebut.scse.generic;

import org.hebut.scse.basic.oop.extend.fru.Apple;
import org.hebut.scse.basic.oop.extend.fru.Fruit;
import org.hebut.scse.basic.oop.extend.fru.Jonathan;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance {
    public static void main(String[] args) { 
        // Wildcards allow covariance: 
        List<? extends Fruit> flist = new ArrayList<Apple>();
        // Compile Error: can’t add any type of object: 
        // flist.add(new Apple());
        // flist.add(new Fruit()); 
        // flist.add(new Object()); 
        flist.add(null); // Legal but uninteresting 
        // We know that it returns at least Fruit: 
        Fruit f = flist.get(0);
        List<? super Apple> flist2 = new ArrayList<Apple>();
        Object o = flist2.get(0);
        flist2.add(new Apple());
        flist2.add(new Jonathan());
//        flist2.add(new Fruit());
    }
} ///:~