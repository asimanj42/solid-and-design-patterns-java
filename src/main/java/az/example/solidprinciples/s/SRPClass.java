package az.example.solidprinciples.s;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


//In this class Single Responsibility Principle is implemented.
public class SRPClass {


    public static final int THRESHOLD = 5;

    public static void main(String[] args) {

        System.out.println("Welcome to the Application!");
        List<Integer> nums = getInputFromUser();
        sort(nums);
        showOutput(nums);
    }
    private static boolean isValid(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException nfe) {
            return false;
        }

        int num = Integer.parseInt(input);

        if (num < 0 || num > 10) {
            return false;
        }
        return true;
    }

    private static List<Integer> getInputFromUser() {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");

        while (nums.size() < THRESHOLD) {

            String s = scanner.nextLine();
//validations
            if (!isValid(s)) {
                continue;
            }

            nums.add(Integer.valueOf(s));
        }

        scanner.close();
        return nums;
    }

    private static void sort(List<Integer> inputs) {
        Collections.sort(inputs);
    }

    private static void showOutput(List<Integer> inputs) {
        for (int num : inputs)
            System.out.print(num + " ");
    }
}