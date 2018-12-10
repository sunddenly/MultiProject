package org.hebut.scse.concurrent.guava;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.*;
import org.hebut.scse.concurrent.task.CallableTask;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.Executors;

/**
 * @Author　　　　xinyu.jiang
 * @Date　　　　　2018-09-03 10:47:00
 * @Department　　HotelProduct
 * @Copyright (c) 1999 - 2017 艺龙网信息技术（北京）有限公司
 */
public class FuturesDemo {

    @Test
    public void futuresAllAsListTest() {
        List<ListenableFuture<String>> futureList = Lists.newArrayList();

        ListeningExecutorService service = MoreExecutors.listeningDecorator(Executors.newCachedThreadPool());
        for (int i = 0; i < 10; i++) {
            CallableTask task = new CallableTask("task-" + i, i % 2 + "");
            futureList.add(service.submit(task));
        }

        for (ListenableFuture<String> future : futureList) {
            Futures.addCallback(future, new FutureCallback<String>() {
                @Override
                public void onSuccess(String result) {
                    System.out.println("onSuccess" + result);
                }

                @Override
                public void onFailure(Throwable t) {
                    System.out.println("onFailure" + t.getMessage());
                }
            });
        }

        ListenableFuture<List<String>> future = Futures.allAsList(futureList);
        try {
            List<String> list = future.get();
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }

        ListenableFuture<List<String>> future2 = Futures.successfulAsList(futureList);
        try {
            List<String> list = future2.get();
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
