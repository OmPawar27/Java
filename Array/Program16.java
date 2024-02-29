// 16. Write a program to find the product of all except self for each element in an array.

public class Program16 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        
        for (int i = 0; i < arr.length; i++) {
            int total = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] != arr[j]) {
                    total *= arr[j];
                }
            }
            System.out.println(arr[i] + ":" + total);
        }
    }
}
