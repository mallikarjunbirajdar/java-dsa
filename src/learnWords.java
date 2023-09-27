import java.util.Scanner;

public class learnWords {
    public static void main(String[] args) {
        Scanner ch=new Scanner(System.in);
        System.out.println("enter the char");
        char pan=ch.next().charAt(0);
        System.out.println(pan);

       if ( pan >= 'a' && pan <= 'z')
        {
            System.out.println("lowercase");
        }
        else
        {
            System.out.println("uppercase");
        }
    }
}
