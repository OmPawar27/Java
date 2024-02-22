//5. Write a Java program to find all pairs in an array whose sum is equal to a given target.

public class Program5 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int target = 6;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                if(arr[i] + arr[j] == target && arr[i] != arr[j])
                    System.out.println("Pair 1: " + arr[i] + " Pair 2: " + arr[j]);
            }
        }
    }
}
