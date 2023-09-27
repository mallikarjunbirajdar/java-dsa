import java.util.*;

public class array12
{
    public static void main(String[] args)
    {
        int a[]=new int[5];
        System.out.println("enter the array");
        Scanner s=new Scanner(System.in);

        for (int i=0;i<5;i++)
        {
            a[i]=s.nextInt();

        }
        System.out.println("array element");

        System.out.println(Arrays.toString(a));
    }
}
