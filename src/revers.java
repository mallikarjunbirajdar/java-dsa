import java.net.SocketOption;
import java.util.Scanner;

public class revers {

    public static void main(String[] args) {


        System.out.println("enter the number");

        Scanner sc=new Scanner(System.in);
        int rev=0;
        int num=sc.nextInt();

        while (num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("reverse number is"+rev);
    }
}
