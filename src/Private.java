public class Private
{
    int a;
    double b;
    String name;
    Private ()
    {
        a=10;
        b=3.56;
        name="malik";
        System.out.println(a+" "+b+" "+name);

    }

    public static void main(String[] args) {
        Private ref=new Private();
    }
}
