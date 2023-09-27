

import java.util.Scanner;

public class fffff {
    public static void main(String[] args)
    {
        int a[]=new int [5];
        System.out.println("enter the any array");
        Scanner s=new Scanner(System.in);

        for(int i=0;i<5;i++)
        {
            a[i]=s.nextInt();

        }
        System.out.println("/n array element");
        for (int b:a)
        {
            System.out.println(b+" ");
        }
    }

}
