
// Dead=Lock Situation.

class Library1 implements Runnable
{
    String res1="DSA";
    String res2 = "Java";
    String res3 = "Spring";
    @Override
    public void run()
    {
        String tname= Thread.currentThread().getName();
        if(tname.equals("Student-1"))
        {
            try
            {
                synchronized (res1)
                {
                    System.out.println("Student-1 has taken "+res1);
                    Thread.sleep(4000);
                    synchronized (res2)
                    {
                        System.out.println("Student-1 has taken "+res2);
                        Thread.sleep(4000);
                        synchronized (res3)
                        {
                            System.out.println("Student-1 has taken "+res3);
                        }
                    }
                }
            }
            catch (Exception e)
            {
                System.out.println("Some Error");
            }
        }
        else
        {
            try
            {
                synchronized (res3)
                {
                    System.out.println("Student-2 has taken "+res3);
                    Thread.sleep(4000);
                    synchronized (res2)
                    {
                        System.out.println("Student-2 has taken "+res2);
                        Thread.sleep(4000);
                        synchronized (res1)
                        {
                            System.out.println("Student-2 has taken "+res1);
                        }
                    }
                }
            }
            catch (Exception e)
            {
                System.out.println("Some Error");
            }
        }
    }
}

public class mt11 {
    public static void main(String[] args) {
        Library1 l = new Library1();
        Thread t1 = new Thread(l);
        Thread t2 = new Thread(l);
        t1.setName("Student-1");
        t2.setName("Student-2");
        t1.start();
        t2.start();
    }
}
