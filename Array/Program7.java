//7. Write a Java program to find the maximum sum subarray in an array.

public class Program7 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, -4, 3, 2, -10, 9, 1 };
        // Output = 11 Explanation = 1, 2, 7, -4, 3, 2
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp = 0;
                for (int z = i; z <= j; z++) {
                    temp += arr[z];
                }
                if (temp > max)
                    max = temp;
            }
        }
        System.out.println("Maximum Sum Subarray is: " + max);
    }
}
