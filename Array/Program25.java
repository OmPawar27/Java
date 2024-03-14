// Q25.Implement a function to find the maximum length of subarray with sum equal to k

public class Program25 {
    public static void main(String[] args) {
        int arr[] = {10,5,2,7,1,9,6};

        int k = 15;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                int sum = 0,count = 0;
                for(int z = i; z<=j;z++){
                    sum += arr[z];
                    count++;
                    if(sum == k && max<count){
                        max = count;
                    }
                }
                System.out.println();
            }
        }
        System.out.println(max);
    }
}
