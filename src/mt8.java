// race condition
class Car implements Runnable
{
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " Entered Parking Area ");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + " Entered into Car");
            Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " Started Car");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " Went to Drive");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " Came Back to Parking Area");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " Get Out of Car");
                Thread.sleep(4000);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

public class mt8 {
    public static void main(String[] args) {
        Car c = new Car();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);
        t1.setName("Ravi");
        t2.setName("Sai");
        t3.setName("Abhi");
        t1.start();
        t2.start();
        t3.start();
    }
}
