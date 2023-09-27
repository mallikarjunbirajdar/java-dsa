import java.sql.SQLOutput;
import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("enter the temp");

        float tempC= r.nextFloat();
        float tempf=(tempC*9/5)+32;
        System.out.println(tempf);
    }
}
