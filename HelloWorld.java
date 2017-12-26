package helloworld;

public class HelloWorld {
    public static void main(String[] args) {
      String greeting = "Hello world!";
      int stringLength = greeting.length();
      String uCase = greeting.toUpperCase();
      String firstSub = greeting.substring(6);
      int[] nums = {9, 2, 4, 8, 3};
      int[] moreNums = {10, 3, 5, 9, 4};
      System.out.println(greeting);
      System.out.println(stringLength);
      System.out.println(uCase);
      System.out.println(firstSub);
      System.out.println(Arrays.equals(nums, moreNums));
      System.out.println(Arrays.toString(moreNums));
      System.out.println(nums.length);
    }

}
