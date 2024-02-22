//2. Implement a Java function to find the second largest element in an array.

public class Program2 {
    void secondLarge(int[] arr){
        int secMax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(max < arr[i]){
                secMax = max;
                max = arr[i];
            }
        }
        System.out.println("Second Max number is: " + secMax);
    }
    public static void main(String[] args) {
        Program2 obj = new Program2();
        int arr[] = {1,2,3,4,5,6,7,8,9};
        obj.secondLarge(arr);
    }
}
