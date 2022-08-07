package array;

public class counTheWordsStr {
    public static void main(String[] args) {
        int count = 1;
        String s1 = "hi how are you";

        for (int i = 0; i < s1.length() - 1; i++) {
            if ((s1.charAt(i) == ' ') && (s1.charAt(i + 1) != ' '))
                count++;
        }
        System.out.println(count);
    }}