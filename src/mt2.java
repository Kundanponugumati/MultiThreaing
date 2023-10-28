import java.sql.SQLOutput;

public class mt2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread Started");
//        Thread.sleep(5000);
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setName("hello");
        Thread.currentThread().setPriority(6);
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("Main Thread Ended");
    }
}
