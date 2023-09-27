import java.util.Arrays;
import java.util.Scanner;

public class palidrom_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");

        String str=sc.next();

        String rev="";

        int len=str.length();

        for (int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);


        }

        if (str.equals(rev))
        {
            System.out.println(str+" is palidrom String");
        }
       /*if (org_str.equals (rev))
       {
           System.out.println(org_str+" is palidrom String");
       }*/
       else
       {
           System.out.println(str+" not palidrom String");
       }
    }
}