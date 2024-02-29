//14. Write a Java program to find the shortest unsorted continuous subarray that 
//    if sorted, the entire array becomes sorted.

class Program14 {
    public static void main(String[] args) {
        int arr[] = { 10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60 };

        // output : 30, 25, 40, 32, 31, 35

        int startIndex = -1;
        int endIndex = -1;

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    startIndex = i;
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }

        flag = false;

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[i]) {
                    endIndex = i;
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }

        if (startIndex == -1) {
            System.out.println("Array is already sorted");
            return;
        }

        System.out.println("Start Index: " + startIndex + " End Index: " + endIndex);

        System.out.println("Shortest unsorted continuous subarray is: ");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}