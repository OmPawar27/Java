//1. Write a Java program to find the maximum product of two integers in an array.

// import java.util.*;

class Program1 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            }
        }
        System.out.println("Maximum product of two integers in array is: " + secMax * max);
    }
}