/*
 * Given and array of n integers.The problem is to find the sum of the 
 * elements of the contiguous subarray having smallest(min) sum.
 */

public class Program2 {
    public static void main(String[] args) {
        
        int arr[] = {3,-4,2,-3,-1,7,3};
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<arr.length; i++){
            int sum = 0;
            for(int j = i; j<arr.length; j++){
                sum += arr[j];
                if(sum < min)
                    min = sum;
            }
        }
        System.out.println(min); // -4,2,-3,-1 = -6
    }
}
