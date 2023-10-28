import java.util.Scanner;

class alpha1 extends Thread{
    public void run()
    {
        System.out.println("Banking Activity Started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Accnt No");
        int accntNo= sc.nextInt();
        System.out.println("Enter Password");
        int pass = sc.nextInt();
        System.out.println(pass);
        System.out.println("Login Successful");
        System.out.println("Banking Activity Ended");
    }
}
class beta1 extends Thread{
    public void run()
    {
        System.out.println("printing number Activity Started");
        for(int i=1;i<5;i++)
        {
            System.out.println("the number is "+i);
        }
        System.out.println("printing number Activity Ended");
    }
}
class gamma1 extends Thread{
    public void run()
    {
        System.out.println("printing message Activity Started");
        for(int i=1;i<5;i++)
        {
            System.out.println("Consistency is the KEY");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("some error");
            }
        }
        System.out.println("printing message Activity Ended");
    }
}
public class mt4 {
    public static void main(String[] args) {
        alpha1 a = new alpha1();
        beta1 b = new beta1();
        gamma1 g = new gamma1();
        a.start();
        b.start();
        g.start();

    }
}
