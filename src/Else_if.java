import java.util.Scanner;

public class Else_if
{
    public static void main(String[] args)
    {
      int marks;
      System.out.println("enter the marks");
        Scanner s=new Scanner(System.in);
        marks=s.nextInt();
        if (marks>60&&marks<=100)
        {
            System.out.println("First Rank");

        }
        else if (marks>45&&marks<=60)
        {
            System.out.println("second Rank");

        }
        else
        {
            System.out.println("fail......");

        }
    }
        }
