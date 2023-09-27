import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
       /* ArrayList<Integer> a = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int c = in.nextInt();
        a.add(b);
        a.add(c);
        System.out.println(a);
*/
// Scanning the array
       /* Scanner in = new Scanner(System.in);
        int[] a = new int[8];

        for(int i= 0 ; i < a.length; i++){
            a[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(a));*/
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of the array ");
        int b = in.nextInt();
        System.out.println("enter the elements in array");
        int[] a = new int[b];
        try {
            for(int i= 0 ; i <= a.length-1; i++) {
                a[i] = in.nextInt();
            }
        }catch (Exception exception){

        }

        System.out.println(Arrays.toString(a));
    }
}
