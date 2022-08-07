public class oddEvenCount {
    public static void main(String[] args) {
        int num = 1234567;
        int odd_count = 0;
        int even_count = 0;

        while (num > 0) {
            int rem = num % 10;

            if (rem % 2 == 0) {
                even_count++;
            } else
            {
                odd_count++;
            }
            num =num /10;
        }
        System.out.println("the even count are : " +even_count);
        System.out.println("the odd count are : " + odd_count);
    }}