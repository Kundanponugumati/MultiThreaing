import java.util.Scanner;

class Alien implements Runnable
{
    @Override
    public void run() {
        String thread = Thread.currentThread().getName();
       if(thread.equals("Msg"))
       {
           message();
       }
        else
        {
            calc();
        }

    }
    public void calc()
    {
        System.out.println("Calc method Started");
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2 = sc.nextInt();
        int res = n1+n2;
        System.out.println(res);
        System.out.println("Calc method Ended");
    }
    public void message()
    {
        System.out.println("Message method Started");
        for(int i=0;i<5;i++)
        {
            System.out.println("Focus is KEY");
        }
        System.out.println("Message method Ended");
    }

}
public class mt7 {
    public static void main(String[] args) {
        Alien a = new Alien();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);
        t1.start();
        t2.start();
        t1.setName("Calc");
        t2.setName("Msg");
    }
}
