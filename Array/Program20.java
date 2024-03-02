/*
 * Q20. Given an array of positive integers numbers and a positive integer
 * target(key), retrun the minimal length of a subarray whose sum is
 *  grater than or eqyal to targer. IF there is no such subarray retrun 0
 */

 public class Program20 {
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,4,3};
        int key = 7;

        int minCount = Integer.MAX_VALUE;
        boolean flag = false;

        for(int i = 0; i<arr.length; i++){
            int count = 0;
            int sum = 0;
            for(int j = i; j<arr.length; j++){
                count++;
                sum += arr[j];
                if(sum == key){
                    flag = true;
                    if(minCount > count)
                        minCount = count;
                }
                if(sum > key)
                    break;
            }
        }
        if(flag == true)
            System.out.println(minCount);
        else
            System.out.println(0);
    }
}
