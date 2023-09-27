import java.util.Scanner;

public class switch_s {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int day=4;
        switch(day)
        {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;

        }
    }
}
