//10. Implement a function to find the majority element in an array (element that appears more than n/2 times).

public class Program10 {
    public static void main(String[] args) {
        int arr[] = {3,1,2,3,3,4,5,3,3};

        for(int i = 0; i<arr.length; i++){
            int count = 1;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > arr.length/2)
                System.out.println("Majority Element fount: " + arr[i]);
        }
    }
}
