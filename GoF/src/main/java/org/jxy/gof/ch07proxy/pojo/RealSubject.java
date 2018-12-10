package com.elong.design.pattern.ch07proxy.pojo;

public class RealSubject implements Subject {

    @Override
    public void dealTask(String taskName) {
        System.out.println("正在执行任务："+taskName);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}