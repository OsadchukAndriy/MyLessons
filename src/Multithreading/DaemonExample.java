package Multithreading;

public class DaemonExample {
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("user_thread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemon_thread");
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
        System.out.println("Main thread ends");

}

static class UserThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()
        + " is daemon: " + isDaemon());
        for (char i = 'A'; i <= 'J'; i++){
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
static class DaemonThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()
                + " is daemon: " + isDaemon());
        for (int i = 1; i <= 1000; i++){
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}}
