package ru.bikbaev.sem5.task1;

public class Main {
    public static void main(String[] args) {
        ObjectA objectA = new ObjectA();
        ObjectB objectB = new ObjectB();

        Thread thread1 = new Thread(()->{
            synchronized (objectA){
                System.out.println("поток 1 заблок поток а");
                synchronized (objectB){
                    System.out.println("поток 1 заблок поток b");
                }
            }
        });


        Thread thread2 = new Thread(()->{
            synchronized (objectB){
                System.out.println("поток 2 заблок поток b");
                synchronized (objectA){
                    System.out.println("поток 2 заблок поток а");
                }
            }
        });


        thread1.start();
        thread2.start();
    }
}
