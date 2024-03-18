package ru.bikbaev.sem5.task3;

import java.util.concurrent.CountDownLatch;

/*
В рамках выполнения задачи необходимо:
    3 бегуна должны прийти к старту гонки
    Программа должна гарантировать, что гонка начнется
    только когда все три участника будут на старте
    Программа должна отсчитать “На старт”, “Внимание”, “Марш”
    Программа должна завершиться когда все участники закончат гонку.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch cdl = new CountDownLatch(4);
        Runner runner = new Runner("Runner1",cdl);
        Runner runner2 = new Runner("Runner2",cdl);
        Runner runner3 = new Runner("Runner3",cdl);

        runner.start();
        runner2.start();
        runner3.start();

        while (cdl.getCount()!=1){
            Thread.sleep(100);
        }
        System.out.println("На старт");
        Thread.sleep(1000);
        System.out.println("Внимание");
        Thread.sleep(1000);
        System.out.println("Марш");
        cdl.countDown();
    }
}
