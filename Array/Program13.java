//13. Write a program to find the longest increasing subsequence in an array.
// Input : arr[] = {5, 6, 3, 5, 7, 8, 9, 1, 2}
// Output : 5
// The subarray is {3, 5, 7, 8, 9}

public class Program13 {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 3, 5, 7, 8, 9, 1, 2 };
        int start = -1;
        int end = -1;
        int max = 0;
        
        for(int i = 0; i<arr.length; i++){
            int temp = arr[i];
            int count= 0;
            for(int j = i+1; j<arr.length; j++){
                if(temp < arr[j]){
                    temp = arr[j];
                    count++;
                }else{
                    break;
                }
                if(count > max){
                    max = count;
                    start = i;
                    end = j;
                }
            }
            
        }

        for(int i = start; i<=end; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
