import java.util.Scanner;

public class fibinicc1_seri {
    public static void main(String[] args) {
        int a=0,b=1,c,term;
        System.out.println("entre the term");
        Scanner r=new Scanner(System.in );
        term=r.nextInt();

        for (int i=1;i<=term;i++)
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }

}
