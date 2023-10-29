
class Producer implements Runnable
{
//    Queue queue;
//    public Producer(Queue q)
//    {
//        queue = q;
//    }
    Queue q;
    public Producer(Queue q)
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

class Consumer implements Runnable
{
//    Queue queue;
//    public Consumer(Queue q)
//    {
//        queue = q;
//    }

    Queue q;
    public Consumer(Queue q)
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

class Queue
{
    int x;
    public void put(int i)
    {
        x=i;
        System.out.println("Producer produced data "+i);
    }
    public void get()
    {
        System.out.println("Consumer consumed data "+x);
    }

}

public class producerConsumerProblem {
    public static void main(String[] args) {
        Queue q = new Queue();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        Thread t1= new Thread(p);
        Thread t2= new Thread(c);
        t1.start();
        t2.start();
    }
}
