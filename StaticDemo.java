package staticdemo;

class MyClass {
    public String message = "Hello World";

    public void displayMessage() {
        System.out.println("Message = " + messge);
    }

    public static String greetings = "Good morning";

    public static void displayGreetings() {
        System.out.println("Greeting = " + greetings);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        MyClass sd = new MyClass();

        System.out.println(MyClass.greetings);
        MyClass.displayGreetings();
    }

}
