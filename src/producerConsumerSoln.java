
class Producer1 implements Runnable
{
    Queue1 q;
    public Producer1(Queue1 q)
    {
        this.q=q;
    }
    @Override
    public void run()
    {
        int i=1;
        while(true)
        {
            q.put(i);
            i++;
        }
    }
}

class Consumer1 implements Runnable
{
    Queue1 q;
    public Consumer1(Queue1 q)
    {
        this.q=q;
    }
    @Override
    public void run() {
        while(true)
        {
            q.get();
        }
    }
}

class Queue1
{
    int x;
    boolean flag = false;

    synchronized public void put ( int i) {
        try
        {
            if(flag==false)
            {
                x = i;
                System.out.println("Producer produced data " + i);
                flag=true;
            }
            else
            {
                wait();
            }
        }
        catch (Exception e)
        {
            System.out.println("Some error");
        }
    }
    synchronized public void get()
    {
        try
        {
            if(flag==true)
            {
                System.out.println("Consumer consumed data " + x);
                flag=false;
            }
            else
            {
                notify();
            }
        }
        catch (Exception e)
        {
            System.out.println("Some Error");
        }
    }

}

public class producerConsumerSoln {
    public static void main(String[] args) {
        Queue1 q = new Queue1();
        Producer1 p = new Producer1(q);
        Consumer1 c = new Consumer1(q);
        Thread t1= new Thread(p);
        Thread t2= new Thread(c);
        t1.start();
        t2.start();
    }
}
