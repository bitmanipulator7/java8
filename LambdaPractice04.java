import java.util.function.Supplier;

public class LambdaPractice04 {
    public static void main(String[] args) {
        ExampleFunctionalInterface0372 functionalInterface0372 = new ExampleFunctionalInterface0372() {
            public String behavior0372() {
                return "Howdy?";
            }
        };
        System.out.println(functionalInterface0372.behavior0372());

        ExampleFunctionalInterface0372 functionalInterface03721 = () -> "How are you doing?";
        System.out.println(functionalInterface03721.behavior0372());
        // String output03721 = functionalInterface03721::behavior0372;
        // the above statement would result in an error because,
        // the method reference (functionalInterface03721::behavior0372) refers to a method, not the result of that method.

        Supplier<String> supplier = functionalInterface03721::behavior0372;
        System.out.println(supplier.get());

        Supplier<String> supplier1 = functionalInterface0372::behavior0372;
        System.out.println(supplier1.get());
    }
}

interface ExampleFunctionalInterface0372 {
    String behavior0372();
}