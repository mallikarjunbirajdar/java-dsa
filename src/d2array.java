import java.util.Scanner;

public class d2array
{
    public static void main(String[] args)
    {
        int a[][] = new int[2][2];
        System.out.println("enter any arrary");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                a[i][j] = s.nextInt();
            }
        }
            System.out.println("matrix from");
            for (int i = 0; i < 2; i++)
            {
                for (int j = 0; j < 2; j++)
                {
                    System.out.println(a[i][j] + "  ");
                }

            }

        }


    }

