package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Zaur", lock);
        new Employee("Andrii", lock);
        new Employee("Taras", lock);
        new Employee("Viktor", lock);
        new Employee("Marina", lock);
    }
}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        try {
            System.out.println(name + " wait");
            lock.lock();
            System.out.println(name + " use bankomat");
            Thread.sleep(3000);
            System.out.println(name + " end actings");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
}
