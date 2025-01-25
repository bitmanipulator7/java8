import java.util.ArrayList;
import java.util.List;

public class LambdaPractice01 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);
        numbers.add(10);
        numbers.add(14);
        System.out.println(numbers);

        LambdaPractice01 practice01 = new LambdaPractice01();
        System.out.println("Add 2 to all elements: " + practice01.addTwo(numbers));
        System.out.println("Square all the elements: " + practice01.square(numbers));
    }

    public List<Integer> addTwo(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        numbers.forEach(n -> result.add(n + 2));
        return result;
    }

    public List<Integer> square(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        numbers.forEach(n -> result.add(n * n));
        return result;
    }
}
