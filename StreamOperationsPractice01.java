import java.lang.reflect.Array;
import java.util.*;

public class StreamOperationsPractice01 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 7, 8, 4, 5);
        // Using streams to filter numbers greater than 5
        numbers.stream().filter(n -> n > 5).forEach(System.out::println);

        List<String> firstNames = Arrays.asList("John", "Jane", "Jamie", "Clara");
        System.out.println(firstNames);
        firstNames.stream().filter(n -> n.startsWith("J")).forEach(System.out::println);
        //startsWith is a method of the String class to check if the string starts with the given prefix
        //startsWith return boolean values

        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        // In the line above,
        // stream() creates a Stream from the list,
        // filter() is an intermediate operation that filters the elements, and
        // forEach() is a terminal operation that applies the action to each element.
    }
}
