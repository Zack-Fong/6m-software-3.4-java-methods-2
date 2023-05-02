import java.util.ArrayList;

public class MethodsAssignment {
    public static void main(String args[]) {
        // Uncomment these to test:
        checkOddEven(998);
        checkOddEven(1237);

        // Uncomment these to test:
        System.out.println(capsCombine("john", "smith"));
        System.out.println(capsCombine("charlize", "doe"));

        // Uncomment these to test:
        int test_arr1[] = { 1, 2, 3, 4, 5 };
        int test_arr2[] = { 99, 100, 77, 62, 87, 92, 91, 100 };
        System.out.println(getAverage(test_arr1));
        System.out.println(getAverage(test_arr2));

    }

    // 1. Create a method called checkOddEven that gets an integer and prints "The
    // number is odd/even" depending on the result.

    // Add code here
    static void checkOddEven(int number) {
        // code to be executed
        String result = "The number is odd";
        if (number % 2 == 0) {
            result = "The number is even";
        }
        System.out.println(result);
        return;
    };

    // 2. Create a method called capsCombine that gets two strings and converts both
    // to uppercase and joins them with a space.

    // Add code here
    static String capsCombine(String stringOne, String stringTwo) {
        // code to be executed
        return (stringOne.toUpperCase() + " " + stringTwo.toUpperCase());
    };

    // 3. Create a method called getAverage that gets an array of numbers and
    // returns the average of the values in the array.

    // Add code here
    static float getAverage(int numbers[]) {
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return ((float) total / numbers.length);
    }

}
