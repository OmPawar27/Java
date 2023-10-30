public class Program9{
    int count = 0;
    void reverseStr(String str, int index){
        if(index <str.length()){
            reverseStr(str, index + 1);
            System.out.print(str.charAt(index));
        }
    }
    public static void main(String[] args) {
        Program9 obj = new Program9();
        obj.reverseStr("pawar", 0);
    }
}