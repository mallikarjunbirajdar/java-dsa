import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class learnStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,5,2,3,6,9,8,7);
        /*Stream<Integer> s = list.stream();
        Stream<Integer> b =  s.sorted();
        Stream<Integer> f = b.filter(n-> n%2 == 1);
        f.forEach(n-> System.out.print(n + " "));*/
        /*
        list.stream().sorted().filter(n-> n%2 == 1).forEach(n -> System.out.print(n + " "));*/

        list.stream().sorted().filter(n-> n%2 == 1).forEach(n -> System.out.print(n + " "));
        System.out.println(

        );
         list.stream().sorted().filter(n-> n%2 == 0).forEach(n -> System.out.print(n + " "));


    }
}
