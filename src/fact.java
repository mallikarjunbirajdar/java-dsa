import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number which you want to have a factorial :-");
        int a = in.nextInt();
        System.out.println(factorial(a));
    }
    static int factorial(int a ){
        if(a ==1){
            return 1;
        }
        return a * factorial(a-1);
    }
}
