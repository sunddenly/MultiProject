package org.hebut.scse.exception;

/**
 * Created by jxy on 2016/11/28.
 */
public class program {
    int j=0;
    int i=j+1;
    public static void main(String[] args) {
        Integer a=1;
        Integer b=2;
        Integer c=3;
        Integer d=3;

        Integer e=321;
        Integer f=321;

        Long g=3L;

        System.out.println(c==d);
        System.out.println(e==f);
        System.out.println(c==(a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g==(a+b));
        System.out.println(g.equals(a+b));

        //System.out.println("return："+fun());
    }

    private static int fun() {
        int i=0;
        try{
            //int num = 2 / 0;
            return i+1;
        }catch (Exception e){
            return i++;
        }finally {
            if(i>0)
                i++;
            System.out.println("finally:"+i);
        }
    }
}
