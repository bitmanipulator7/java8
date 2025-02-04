import java.util.function.BiFunction;
// Here, we use predefined functional interface BiFunction to refer methods.
// we are using BiFunction interface and using it's apply() method
public class MethodReference04 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
        int result = adder.apply(5, 10);
        System.out.println(result);
    }
}

class Arithmetic {
    public static int add(int a, int b) {
        return a + b;
    }
}
