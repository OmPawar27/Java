//11. Write a Java program to find the smallest missing positive integer in an unsorted array.
// Input:  arr[] = {2, 3, 7, 6, 8, -1, -10, 15}
// Output: 1

class Program11 {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, -1, -2 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        boolean notFound = true;
        for (int i = 1; i < max; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j])
                    flag = true;
            }
            if (flag == false) {
                System.out.println(i);
                notFound = false;
                break;
            }
        }
        if (notFound)
            System.out.println("Smallest missing positive integer is :" + (max + 1));
    }
}