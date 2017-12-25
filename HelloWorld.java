package helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        String greeting = "Hello world!";
        int stringLength = greeting.length();
        String uCase = greeting.toUpperCase();
        String firstSub = greeting.substring(6);
        System.out.println(greeting);
        System.out.println(stringLength);
        System.out.println(uCase);
        System.out.println(firstSub);
    }

}
