/*
 * Q23. Given and array. Find the product  of the maximum
 * product subArray
 */

public class Program23 {
    public static void main(String[] args) {
        int arr[] = { 6, -3, -10, 0, 2 };

        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = i; j < arr.length; j++) {
                product *= arr[j];
                if (product > maxProduct)
                    maxProduct = product;
            }
        }
        System.out.println(maxProduct);
    }
}
