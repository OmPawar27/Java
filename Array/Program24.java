// Q24. Write a Java program to find the maximum difference between two elements in an array such that the larger element appears after the smaller element.

class Program24 {
    public static void main(String[] args) {
        int arr[] = { 7, 2, 8, 4, 11, 9 };

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max - min);
    }
}
