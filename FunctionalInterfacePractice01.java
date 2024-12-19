public class FunctionalInterfacePractice01 {
    public static void main(String[] args) {
        SampleFunctionalInterface01 sFI = (int i)-> System.out.println(2*i);

        sFI.abstractMethod01(20);
    }
}

// A Functional Interface is an interface which will have only one abstract method
// It can have any number of default, static methods but strictly have only a single abstract method
interface SampleFunctionalInterface01 {
    // An abstract method
    void abstractMethod01(int x);

    //  Default method
    default void defaultMethod01() {
        System.out.println("Hello World!");
    }
}
