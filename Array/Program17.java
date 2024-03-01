// 17.Implement a function to find the maximum length of a subarray with equal number of 0s and 1s.

public class Program17 {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 0, 1, 0, 1, 0 };
        int max = Integer.MIN_VALUE;
        int maxStart = -1;
        int maxEnd = -1;

        for (int i = 0; i < arr.length; i++) {
            int countZero = 0;
            int countOne = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0) {
                    countZero++;
                } else {
                    countOne++;
                }
                if (countOne == countZero) {
                    if (countOne >= max) {
                        max = countOne;
                        maxStart = i;
                        maxEnd = j;
                    }
                }
            }
        }

        System.out.println("Maximum length of a subarray with equal number of 0s and 1s is:");
        for (int i = maxStart; i <= maxEnd; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
