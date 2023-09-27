class cse
{
    int a;
    Double b;
   cse()
    {
        a=10;
        b=2.23;
    }
    void disp()
    {
        System.out.println(a+" "+b);
    }
}
class Def
{
    public static void main(String[] args) {

        cse d=new cse();
        d.disp();
    }
}
