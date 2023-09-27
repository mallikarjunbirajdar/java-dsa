/*
import java.util.Scanner;

class Bank
{
    private double bal = 5000;
    private int pwd;

    public void deposite(double money) {
        System.out.println("enter password");
        Scanner s = new Scanner(System.in);

        pwd = s.nextInt();
        if (pwd == 123) {
            bal = bal + money;
            System.out.println("deposites money" + money);
            System.out.println("total balance" + bal);

        } else {
            System.out.println("incorrect password.....");
        }
    }
        public void withdraw(double money) {
            System.out.println("enter password");
            Scanner s = new Scanner(System.in);

            pwd = s.nextInt();
            if (pwd == 123) {
                bal = bal - money;
                System.out.println("withdraw money" + money);
                System.out.println("total balance" + bal);

            } else {
                System.out.println("incorrect password.....");
            }
        }
            public void checkbal()
            {
                System.out.println("enter password");
                Scanner  s= new Scanner(System.in);

                pwd =s.nextInt();
                if (pwd==123)
                {

                    System.out.println("total balance" + bal);


                }


            }
        }


    class customer {
        public static void main(String[] args)
        {
            Bank b=new Bank();

            int ch;

            System.out.println("1.deposite");
            System.out.println("2.withdraw");
            System.out.println("3.checkbal");

            System.out.println("enter password");
            Scanner s2 = new Scanner(System.in);

            ch=s2.nextInt();

            switch (ch)
            {
                case 1: b.deposite();
                  break;

                case 1: b.withdraw();
                    break;

                case 1: b.checkbal();
                    break;

                default: System.out.println("invalide choice");
            }


        }
    }








*/
