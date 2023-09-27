import java.util.Scanner;

public class for_loop
{
    public static void main(String[] args)
   {
//        *//*int num, i;
//        System.out.println("enter the any number");
//        Scanner s=new Scanner(System.in);
//
//        num=s.nextInt();
//        for (  i=1;i<=10;i++)
//        {
//            System.out.println(num*i);
//        }*//*

       System.out.println("enter a number :- ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        multiple(a);
    }
    public static void multiple(int a ){
        int b;
        for(int i = 1 ; i<= 10 ; i++ ){
            b = a*i;
            System.out.println(a +" * "+ i + " = "+b);
        }
    }
}
