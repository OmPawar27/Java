//12. Implement a function to remove duplicates from a sorted array in-place.
import java.util.Arrays;

public class Program12 {
    static boolean checkDuplicate(int arr[], int n){
        for(int i = 0;i<arr.length; i++){
            if(n == arr[i])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};

        int uniqueElement[] = new int[arr.length];

        for(int i = 0,j=0; i<arr.length; i++){
            if(checkDuplicate(uniqueElement,arr[i])){
                uniqueElement[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(uniqueElement));
    }
}
