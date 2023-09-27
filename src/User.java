import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        ArrayList<String> name= new ArrayList<String>();
        name.add("Malik");
        name.add("tusar");
        name.add("abhi");
        name.add("chetan");

        System.out.println(name);

//        for (int i=0;i<name.size();i++)
//        {
//            System.out.println(name.get(i));
//        }
        for (String i:name)
        {
            System.out.println(i);
        }






        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(10);
        a.add(20);
        a.add(25);
        a.add(30);
        System.out.println(a);
        for (Integer b:a)
        {
            System.out.println(b);
        }

    }
}
