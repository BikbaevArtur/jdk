package ru.bikbaev.sem5.task3;

import java.util.concurrent.CountDownLatch;

public class Runner extends Thread{
    private final String name;
    private CountDownLatch cdl;

    public Runner(String name, CountDownLatch cdl) {

        this.name = name;
        this.cdl = cdl;
    }

    public  void goToStart() throws InterruptedException {
        System.out.println(name + "- go to start");
        Thread.sleep((long) (Math.random()*3000L));
        System.out.println(name + "- on start");
        cdl.countDown();

    }


    public  void goToFinish() throws InterruptedException {
        System.out.println(name + "- start go to finish");
        Thread.sleep((long) (Math.random()*3000));
        System.out.println(name + "-  finish");

    }

    @Override
    public void run() {
        try {
            goToStart();
            cdl.await();
            goToFinish();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
