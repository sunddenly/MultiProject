package org.hebut.scse.ref.classloader.load;

public class A {
    private P p1 = new P("A--p1");
    private P p2 = new P("A--p2");
    static  P p3 = new P("A--p3");
    static {
        new P("A--static");
    }
    {
        new P("A{...}");
    }
    public A() {
        System.out.println("A()");
    }
    public static class C {
        private P p1 = new P("C--p1");
        private P p2 = new P("C--p2");
        static  P p3 = new P("C--p3");
        public C() {
            System.out.println("C()");
        }
        static {
            new P("C--static");
        }
        {
            new P("C{...}");
        }
    }
}
class B extends A {
    private P p1 = new P("B --p1");
    public  P p2 = new P("B -- p2");
    static  P p3 = new P("B -- p3");
    static {
        new P("B -- static");
    }

    {
        new P("B{...}");
    }
    public B() {
        System.out.println("B()");
    }
}
class P {
    public P(String s) {
        System.out.println(s);
    }
}