// Q. WAP to print following pattern

/*e e e e e 
d d d d d 
c c c c c 
b b b b b 
a a a a a */

public class Program9 {
    public static void main(String[] args) {
        
        char ch = 'e';

        for(int i = 0; i<5; i++){
            for(int j = 0; j<5; j++){
                System.out.print(ch + " ");
            }
            ch--;
            System.out.println();
        }
    }
}
