public class j_20_9 {
    int x;
    int z;
    int y;
    j_20_9(){
        x=10;
        z=60;
        y=x+z;

    }

    public static void main(String[] args) {
        j_20_9 myobj=new j_20_9();
        System.out.println(myobj.x);
        System.out.println(myobj.z);
        System.out.println(myobj.y);
    }
}
