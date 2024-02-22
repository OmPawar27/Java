//9. Write a program to find the intersection of two arrays.
import java.util.Arrays;

public class Program9 {
    
    static boolean isCheck(int num,int arr[]){
        boolean flag = true;
        for(int i = 0; i<arr.length; i++){
            if(num == arr[i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5,6,2,4};
        int arr2[] = {2,9,4,8,6,0,2,4,6};
        int result[] = new int[Math.min(arr1.length, arr2.length)];

        for(int i = 0,z = 0; i<arr1.length; i++){
            for(int j = 0; j<arr2.length; j++){
                if(arr1[i] == arr2[j] && isCheck(arr1[i],result)){
                    result[z] = arr1[i];
                    z++;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
