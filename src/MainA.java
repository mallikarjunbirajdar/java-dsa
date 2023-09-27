public class MainA
{
    String fname="malik";
    String lname="birajdar";
    int age=22;
    int salary=55000;
    String friends="harshada,siddhi,pranali ,arati ,anushree";

    public static void main(String[] args) {
        MainA myobj=new MainA();
        System.out.println("Name:"+myobj.fname+"  "+myobj.lname);
        System.out.println(myobj.age);
        System.out.println(myobj.salary);
        System.out.println("Friends:-"+myobj.friends);
    }
}
