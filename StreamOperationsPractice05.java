import java.util.Arrays;
import java.util.List;

public class StreamOperationsPractice05 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 7, 8, 4, 5, 10, 15);
        numbers.stream().filter(n -> n > 5).forEach(System.out::print);

        List<String> firstNames = Arrays.asList("John", "Jane", "Jamie", "Clara", "Jill");
        firstNames.stream().filter(n -> n.startsWith("J")).forEach(System.out::println);
    }
}
