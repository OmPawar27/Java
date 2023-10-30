// Q. Find the shortest subArray containing both min and max element

public class Program1{
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,3,4,6,4,6,5};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max)
                max = arr[i];

            if(arr[i] < min)
                min = arr[i];
        }

        int count = 0;
        int minCount = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == min){
                for(int j = i+1; j<arr.length; j++){
                    if(arr[j] == max){
                        count = j-i+1;
                        if(count<minCount){
                            minCount = count;
                        }
                    }
                }
            }
        }
        System.out.println("Shortest subarray is:" + minCount); 
    }
}