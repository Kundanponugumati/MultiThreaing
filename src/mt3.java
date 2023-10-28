import java.util.Scanner;

class alpha implements Runnable{
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
class beta implements Runnable{
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
class gamma implements Runnable{
    public void run()
    {
        System.out.println("printing message Activity Started");
        for(int i=1;i<5;i++)
        {
            System.out.println("Consistency is the KEY");
        }
        System.out.println("printing message Activity Ended");
    }
}
public class mt3 {
    public static void main(String[] args) {
        alpha a = new alpha();
        beta b = new beta();
        gamma g = new gamma();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(g);

        t1.start();
        t2.start();
        t3.start();
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        System.out.println(sc.nextLine());
    }
}
