public class swap1
{
    public static void main(String[] args)
    {
        int a=20,b=30,t;

        System.out.println("before swapping value are "+a+" "+b);

        t=a;
        a=b;
        b=t;

        System.out.println("after swapping value are "+a+" "+b);

    }
    static  void swap(int a , int b ){
        int temp = a ;
        a = b ;
        b = temp ;
    }
}
