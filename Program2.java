package week3;

// Program 2: Sum and average of floating-point array

public class Program2 {
    public static void main(String[] args) {

        float[] marks = {72.5f, 88.0f, 65.5f, 90.0f, 78.5f};

        float sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        float average = sum / marks.length;

        System.out.println("Sum     = " + sum);
        System.out.println("Average = " + average);
    }
}
