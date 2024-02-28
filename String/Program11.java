//  11. Implement a Java function that performs basic string compression using the counts of repeated characters.

public class Program11 {
    public static void main(String[] args) {
        String str = "abaabzxxy";

        StringBuffer sb = new StringBuffer();

        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i));
                sb.append(count);
                count = 1;
            }
        }
        System.out.println(sb);
    }
}
