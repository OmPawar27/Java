//8. Implement a function to move all zeros to the end of an array while maintaining the relative order of non-zero elements.
import java.util.Arrays;

public class Program8 {
    public static void main(String[] args) {
        int arr[] = {0,4,0,5,6,7,0,1,2,0,1,1,5,0};

        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }
        for(int i = j; i<arr.length; i++){
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
