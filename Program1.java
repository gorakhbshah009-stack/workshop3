package week3;

// Program 1: Print array elements in reverse order

public class Program1 {
    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25};

        System.out.println("Original Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nReversed Array:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
    }
}
