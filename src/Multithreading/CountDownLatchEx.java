package Multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    static CountDownLatch countDownLatch = new CountDownLatch(3);
    private static void marketStaffOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff come to work");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }
    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready, so lets open market");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }
    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Open Market");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
        new Friend("Zaur", countDownLatch);
        new Friend("Andrii", countDownLatch);
        new Friend("Taras", countDownLatch);
        new Friend("Inna", countDownLatch);
        new Friend("Anna", countDownLatch);

        marketStaffOnPlace();
        everythingIsReady();
        openMarket();


    }
}
class Friend extends Thread{
    String name;
    private CountDownLatch countDownLatch;
    public Friend(String name, CountDownLatch countDownLatch){
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }
    public void run(){
        try {
            countDownLatch.await();
            System.out.println(name + "приступил к закупкам");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
