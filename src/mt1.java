import java.util.Scanner;

public class mt1 {
    public static void main(String[] args) {
        System.out.println("Banking Activity Started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Accnt No");
        int accntNo= sc.nextInt();
        System.out.println("Enter Password");
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println("Login Successful");
        System.out.println("Banking Activity Ended");
        System.out.println("**************************");

        System.out.println("printing number Activity Started");
        for(int i=1;i<5;i++)
        {
            System.out.println("the number is "+i);
        }
        System.out.println("printing number Activity Ended");
        System.out.println("**************************");

        System.out.println("printing message Activity Started");
        for(int i=1;i<5;i++)
        {
            System.out.println("Consistency is the KEY");
        }
        System.out.println("printing message Activity Ended");
        System.out.println("**************************");
    }
}
