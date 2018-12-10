package org.hebut.scse.generic;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

class Element {
}

class Box<T> {
}

class Pair<KEY, VALUE> {
}

public class ErasureFQA {
    public static void erasureInfo() {
        List<Element> list = new ArrayList<Element>();
        Map<String, Element> map = new HashMap<String, Element>();
        Box<Element> box = new Box<Element>();
        Pair<Integer, String> p = new Pair<Integer, String>();

        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(box.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(p.getClass().getTypeParameters()));
    }

    public static void main(String[] args) {
        erasureInfo();
    }

}