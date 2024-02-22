//4. Implement a function to find the "pivot index" of an array.

public class Program4 {
    public static void main(String[] args) {
        // int arr[] = {1,7,3,6,5,6};
        int arr[] = {2,1,-1};
        
        for(int i = 0; i<arr.length; i++){

            int leftSum = 0;
            int rightSum = 0;

            for(int j = i-1; j>=0; j--){
                if(j < 0) break;
                leftSum += arr[j];
            }
            for(int z = i+1; z<arr.length; z++){
                rightSum += arr[z];
            }
            if(leftSum == rightSum)
                System.out.println("found at: "+ i);            
        }
    }
}
