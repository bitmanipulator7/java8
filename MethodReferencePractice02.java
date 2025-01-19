public class MethodReferencePractice02 {
    public static void main(String[] args) {
        MethodReferencePractice02 obj = new MethodReferencePractice02();
        Sayable2 sayable = obj::doSomething; // referring the non-static method using an object
        sayable.say();

        Sayable2 sayable2 = new MethodReferencePractice02()::doSomething;
        // referring non-static method using anonymous object
        sayable2.say();

        Sayable2 sayable3 = sayable2;
        sayable3.say();
    }

    public void doSomething() {
        System.out.println("I am a non-static / instance method.");
    }
}

interface Sayable2 {
    void say();
}

interface Sayable3 {
    void say();
}
