package firstClass1100.Assignment1;

public class Math {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 3;
        int sum = number1 + number2;
        System.out.println("The sum is equal to: " + sum);
        int difference = number1 - number2;
        System.out.println("The difference is equal to: " + difference);
        int product = number1 * number2;
        System.out.println("The product is equal to: " + product);
        float quotient = number1 / (float) number2;
        System.out.println("The quotient is equal to: " + quotient);
        int wholeNumber = number1 / number2;
        int remainder = number1 % number2;
        System.out.println("The quotient as a fraction is: " + wholeNumber + " " + remainder + "/" + number2);
    }
}
