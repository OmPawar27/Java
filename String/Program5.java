//5. Write a Java program that finds the longest common prefix string amongst an array of strings.
// IP:["apple", "app", "apricot", "aptitude"]
// OP: ap
// IP:["apple", "ball", "apricot", "aptitude"]

public class Program5 {
    public static void main(String[] args) {
        String arr[] = { "apple", "app", "aptitude" };
        StringBuffer str = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            char ch = arr[0].charAt(i);
            int count = 1;
            for (int j = 1; j < arr.length; j++) {
                if (ch != arr[j].charAt(i)) {
                    flag = true;
                    break;
                }
                if (ch == arr[j].charAt(i)) {
                    count++;
                }
                if (count == arr.length)
                    str.append(ch);
            }
            if (flag)
                break;
        }
        System.out.println("Result: " + str);
    }
}
