package main;
// Jackson Williams
import java.util.Scanner;

public class  TriangleMaker{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a positive number
        System.out.print("Welcome to Triangle Maker! Enter the size of the triangle. ");
        int size = scanner.nextInt();

        // First half: increasing part of the triangle
        for (int i = 1; i <= size; i++) {
            printAsterisks(i);
        }

        // Second half: decreasing part of the triangle
        for (int i = size - 1; i > 0; i--) {
            printAsterisks(i);
        }

        scanner.close();
    }

    // Printing line of asterisks
    public static void printAsterisks(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
