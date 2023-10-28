import java.util.Scanner;

class Calc extends Thread
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

class Message extends Thread
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

public class mt5 {
    public static void main(String[] args) {
        Calc c = new Calc();
        Message m = new Message();
        System.out.println(c.isAlive());
        System.out.println(m.isAlive());
        c.start();
        m.start();
        System.out.println(c.isAlive());
        System.out.println(m.isAlive());
//        c.run();
//        m.run();
    }
}
