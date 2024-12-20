public class MethodReferencePractice01 {
    public static void main(String[] args) {
        doSomething01(); //Invoking a static method

        MethodReferencePractice01 obj = new MethodReferencePractice01();
        obj.doSomething02(); //Invoking a non-static method using the object

        Sayable sayableObj = MethodReferencePractice01::doSomething01;
        //A method reference is a shorthand notation of calling a method using the :: operator.
        // This is often used when a method already exists, and we want to pass it around like an object
        // (i.e., pass it as a function)
        //  Method references can be
        // Static method references:- ClassName::methodName
        // Instance method references:- object::methodName
        // Constructor references:- ClassName::new

        sayableObj.say();
    }

    public static void doSomething01() {
        System.out.println("Hey! I am a static method");
    }

    public void doSomething02() {
        System.out.println("Hey! I am not a static method");
    }
}

interface Sayable {
    void say();
}