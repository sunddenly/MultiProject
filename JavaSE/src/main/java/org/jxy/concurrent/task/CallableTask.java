package org.hebut.scse.concurrent.task;

import java.util.concurrent.Callable;

/**
 * @Author　　　　xinyu.jiang
 * @Date　　　　　2018-09-03 10:51:00
 * @Department　　HotelProduct
 * @Copyright (c) 1999 - 2017 艺龙网信息技术（北京）有限公司
 */
public class CallableTask implements Callable<String> {
    private String name;
    private String param;

    public CallableTask(String name, String param) {
        this.name = name;
        this.param = param;
    }

    @Override
    public String call() throws Exception {
        if (param.equals("0")) {
            System.out.println(name + "执行成功");
            return param;

        }
        if (param.equals("1")) {
            System.out.println(name + "执行失败");
            return 5/0 + "";
        }
        return param;
    }
}
