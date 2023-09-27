import java.util.Scanner;

public class forr {
    public static void main(String[] args) {
        //print 1 to n number

        Scanner r=new Scanner(System.in);
        System.out.println("enter the n number");
        int n=r.nextInt();

        for (int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }

}
