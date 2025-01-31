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
    }
}

interface ExampleFunctionalInterface0372 {
    String behavior0372();
}