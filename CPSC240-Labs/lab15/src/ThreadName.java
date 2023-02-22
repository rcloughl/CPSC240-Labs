public class ThreadName extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " found the it");
    }
}
