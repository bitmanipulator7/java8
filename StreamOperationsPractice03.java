import java.util.*;
import java.util.stream.Collectors;

public class StreamOperationsPractice03 {
    public static void main(String[] args) {
        // Chaining multiple stream operations
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //We shall chain filter, map and collect operations
        List<Integer> processedNumbers = numbers.stream()
                .filter(n -> n % 2 == 0) //filter even numbers
                .map(n -> n * 2) //double the numbers filtered in the previous operation of filter
                .collect(Collectors.toList()); //collect into list
        System.out.println(processedNumbers);
        // In this example, we chain a filter to select even numbers,
        // a map to double each number and a collect to gather the results into a list.

        // -----------------------
        // Now, let's sort the elements of a stream
        List<Integer> numbers2 = Arrays.asList(11, 4, 2, 41, 39, 1, 99);
        numbers2.stream().sorted().forEach(System.out::println);
    }
}
