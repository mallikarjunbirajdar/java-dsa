import java.util.Arrays;
import java.util.Scanner;

public class array1
{
    public static void main(String[] args)

    {
        int a[]=new int[5];
        System.out.println("enter any array");
        Scanner s=new Scanner(System.in)  ;

        for (int i=0;i<5;i++)
        {
            a[i]=s.nextInt();

        }
        System.out.print("array element");
       /* for (int b:a)
        {
            System.out.println(b+" ");
        }*/
        System.out.println(Arrays.toString(a));
    }
}
