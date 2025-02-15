public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Jenkins!");

        int num1 = 5;
        int num2 = 4;
        int product = multiply(num1, num2);

        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}

