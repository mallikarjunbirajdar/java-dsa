import java.sql.SQLOutput;
import java.util.Scanner;

public class countnumberdigit {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number:-");

        int a=sc.nextInt();

        int b=0;
        while (a>0)
        {
            a=a/10;
            b++;
        }
        System.out.println("number is digit"  +b);
    }


}
