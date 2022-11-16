import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class Main {
    static Random random = new Random();
    static int[] nums = new int[5];

    public static void main(String[] args) {
        assignArrayValues();
        printUnsortedArray();
        printSortedArray();
        displayUnsortedArray();
        displaySortedArray();
    }

    static void assignArrayValues() {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(10);
        }
    }

    static void displayUnsortedArray() {
        StringBuilder numbers = new StringBuilder();

        for (int i : nums) {
            numbers.append(i).append(" ");
        }
        JOptionPane.showMessageDialog(null, "Unsorted Array:\n" + numbers);
    }

    static void displaySortedArray() {
        int[] nums2 = nums.clone();
        StringBuilder numbers = new StringBuilder();
        Arrays.sort(nums2);

        for (int i : nums2) {
            numbers.append(i).append(" ");
        }
        JOptionPane.showMessageDialog(null, "Sorted Array:\n" + numbers);
    }

    static void printUnsortedArray() {
        System.out.print("Unsorted Array: ");

        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void printSortedArray() {
        int[] nums2 = nums.clone();
        Arrays.sort(nums2);
        System.out.print("Sorted Array: ");

        for (int i : nums2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
