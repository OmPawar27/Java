/*
 * Given and array of DISTINCT elements.
 * Find the missing element in the array
 */

public class Program4 {
    public static void main(String[] args) {
        int arr[] = {1,4,3,5};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int sum1 = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
            sum1 += arr[i];
        }

        int sum2 = 0;
        for(int i = min; i<=max; i++){
            sum2 += i;
        }

        System.out.println("The missing element is:" + (sum2-sum1));
    }
}
