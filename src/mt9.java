
//solving race condition by using synchronized keyword
class Car1 implements Runnable
{
//    synchronized public void run()
    public void run()
    {
        try {
            System.out.println(Thread.currentThread().getName() + " Entered Parking Area ");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + " Entered into Car");
            Thread.sleep(4000);
            synchronized (this){
                System.out.println(Thread.currentThread().getName() + " Started Car");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " Went to Drive");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " Came Back to Parking Area");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " Get Out of Car");
                Thread.sleep(4000);
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

public class mt9 {
    public static void main(String[] args) {
        Car1 c = new Car1();
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
