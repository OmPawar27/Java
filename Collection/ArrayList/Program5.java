/*
 * Given an array of n numbers. The task is to find the first equlibrium
 * point in the array and return the index
 */

public class Program5 {
    public static void main(String[] args) {
        
        int arr[] = {1,3,5,2,2};
        
        for(int i = 0; i<arr.length; i++){
            int leftSum = 0;
            int rightSum = 0;
            for(int j = 0; j<i; j++){
                leftSum += arr[j];
            }
            for(int k = arr.length-1; k>i; k--){
                rightSum += arr[k];
            }
            if(leftSum == rightSum)
                System.out.println(i);
        }
    }
}
