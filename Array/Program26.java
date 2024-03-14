public class Program26 {
    public static void main(String[] args) {
        int arr[] = {4 , 5 , 2 , 25,1};

        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                if(arr[j] > arr[i]){
                    System.out.print(arr[i] + " -> " + arr[j]);
                    break;
                }
                if(j == arr.length-1){
                    System.out.print(arr[i] + " -> " + -1);
                }
            }
            System.out.println();
        }
    }
}
