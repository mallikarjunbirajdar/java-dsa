
import java.util.Scanner;

public class largest_nu {
    public static void main(String[] args){
        System.out.println("enter the number");
        Scanner in=new Scanner(System.in);
//
       int a=in.nextInt();
       int b=in.nextInt();
       int c=in.nextInt();
//
//        System.out.println(a+" "+b+"" +c);
       // System.out.println(c + "  " +Math.max(34,50 ));
  /*   int max = Math.max(70 , Math.max(77 , Math.max(85 ,Math.max(100 , Math.max(80 ,30)))));
        System.out.println(max);*/
       /* int max = Integer.max(70 , Integer.max(77 , Integer.max(85 ,Integer.max(100 ,Integer.max(80 ,30)))));
        System.out.println(max);*/
       int max = Math.max(c, Math.max(a, b));
        System.out.println("Maximum number is " + max);
    }
}
