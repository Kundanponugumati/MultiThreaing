import java.util.Scanner;

class Calc1 extends Thread
{
    public void run()
    {
        System.out.println("Calc method Started");
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2 = sc.nextInt();
        int res = n1+n2;
        System.out.println(res);
        System.out.println("Calc method Ended");
    }
}

class Message1 extends Thread
{
    public void run()
    {
        System.out.println("Message method Started");
        for(int i=0;i<5;i++)
        {
            System.out.println("Focus is KEY");
        }
        System.out.println("Message method Ended");
    }
}

public class mt6 {
    public static void main(String[] args) throws InterruptedException {
        Calc1 c = new Calc1();
        Message1 m = new Message1();
        System.out.println(c.isAlive());
        System.out.println(m.isAlive());
        c.start();
        m.start();
        c.join();
        m.join();
        System.out.println(c.isAlive()); // will be flase because c thread is dead as it completed it's task
        System.out.println(m.isAlive()); // will be flase because m thread is dead as it completed it's task
    }
}
