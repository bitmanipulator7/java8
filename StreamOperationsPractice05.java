import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationsPractice05 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 7, 8, 4, 5, 10, 15);
        numbers.stream().filter(n -> n > 5).forEach(System.out::print);

        List<String> firstNames = Arrays.asList("John", "Jane", "Jamie", "Clara", "Jill");
        firstNames.stream().filter(n -> n.startsWith("J")).forEach(System.out::println);

        //We will chain filter, map and collect operations
        List<Integer> processedNumbers = numbers.stream()
                .filter(n -> n % 2 == 0) //filter even numbers
                .map(n -> n * 2) //double the numbers filtered in the previous operation of filter
                .collect(Collectors.toList()); //collect into list
        System.out.println(processedNumbers);
    }
}
