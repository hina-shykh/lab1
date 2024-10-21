public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int a = 5;
        int b = 10;
        int sum = addNumbers(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }

    public static int addNumbers(int x, int y) {
        return x + y;
    }
}
