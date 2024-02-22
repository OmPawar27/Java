//6. Implement a function to merge two sorted arrays into a single sorted array.

import java.util.Arrays;

public class Program6 {
    void merge(int arr1[], int arr2[]) {
        int arr3[] = new int[arr1.length + arr2.length];
        int arr1End = arr1.length;
        int arr2End = arr1End + arr2.length;

        for (int i = 0; i < arr1End; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1End, j = 0; i < arr2End; i++, j++) {
            arr3[i] = arr2[j];
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void main(String[] args) {
        int arr1[] = { 4, 3, 2, 1 };
        int arr2[] = { 8, 7, 6, 5 };
        Program6 obj = new Program6();
        obj.merge(arr1, arr2);
    }
}
