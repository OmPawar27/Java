
//3. Write a program to rotate an array to the right by k steps.
import java.util.Arrays;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of steps you want to rotate your array");
        int k = sc.nextInt();
        int t = k;

        int rotate[] = new int[k];
        int count = 0;
        int count2 = 0;

        /*for (int i = arr.length - 1, j = 0, z = (arr.length - 1) - k; i >= k - arr.length; i--, j++, z--,k++) {
            if (j == t)
                break;
            rotate[j] = arr[i];
            arr[i] = arr[z];
            arr[k] = arr[j];
            arr[j] = rotate[j];
        }
        System.out.println(Arrays.toString(arr));*/
        int z = (arr.length) - k;
        for(int i = 0; i<arr.length; i++){
            if(z < arr.length){
                rotate[i] = arr[z];
                z++;
            }else{
                rotate[i] = arr[(i-k)];
            }
     
        }
        System.out.println(Arrays.toString(arr));
    }
}
