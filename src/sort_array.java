import java.util.Arrays;
import java.util.Scanner;

public class sort_array
{
    public static void main(String[] args) {
        int a[]=new int[5];
        System.out.println("enter rhe array");
        Scanner s=new Scanner(System.in);
        for (int i=0;i<5;i++)
        {
            a[i]=s.nextInt();
            Arrays.sort(a);
            System.out.println("Sorted array element/n");
            for (int b:a)
            {
                System.out.println(b+" ");
            }
        }
    }
}
