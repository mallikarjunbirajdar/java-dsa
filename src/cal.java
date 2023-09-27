import java.util.Scanner;



import java.util.Scanner;

    class Cal {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int ans = 0;
            while (true) {
                System.out.println("Enter the opater");

                char op = in.next().trim().charAt(0);

                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                    int a = in.nextInt();
                    int b = in.nextInt();

                    System.out.println("enter two number");

                    if (op == '+') {
                        ans = a + b;
                    }
                    if (op == '-') {
                        ans = a - b;
                    }
                    if (op == '*') {
                        ans = a * b;
                    }
                    if (op == '/') {
                        ans = a / b;
                    }
                    if (op == '%') {
                        ans = a % b;
                    }
                    System.out.println(ans);



                }
                else {
                    System.out.println("End the program");
                }
            }
        }
    }
