public class Program17 {
    public static void main(String[] args) {

        int arr1[] = {5,7,9,3,6,2};
        int arr2[] = {1,2,6,-1,0,9};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<arr1.length; i++){
            if(arr1[i]>max)
                max = arr1[i];
        }
        for(int i = 0; i<arr2.length; i++){
            if(arr2[i]<min)
                min = arr2[i];
        }

        System.out.println("Product of " + max + " and " + min + " is: " + max*min);
    }
}
