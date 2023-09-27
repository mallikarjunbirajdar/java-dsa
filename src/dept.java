import java.util.SplittableRandom;

public class dept
{
    int age=21;
    int weight=56;
    String color="black";

    void eat()
    {
        System.out.println("i am eating");

    }
    void sleep()
    {
        System.out.println("i am sleeping");

    }

    public static void main(String[] args)
    {
        dept d=new dept();
        System.out.println(d.age);
        System.out.println(d.weight);
        System.out.println(d.color);

        d.eat();

        d.sleep();

    }

    }
