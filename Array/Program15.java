// 15. Implement a function to find all combinations of 3 elements in an array.

public class Program15 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int z = j + 1; z < arr.length; z++) {
                    System.out.println(arr[i] + "," + arr[j] + "," + arr[z]);
                }
            }
        }
    }
}
