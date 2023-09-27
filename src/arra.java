import java.util.Arrays;
import java.util.Scanner;

public class arra {
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        System.out.println("enter the 2-d array");
        Scanner in=new Scanner(System.in);
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("matri arrra");

        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }

    }

}
