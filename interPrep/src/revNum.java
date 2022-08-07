import java.util.Scanner;

public class revNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value: ");
        int num = sc.nextInt();

        // algorithm
        int rev=0;
        while (num!=0){
            rev = rev*10 + num %10;
            num =num /10;
        }
        System.out.println(" the reversed  value are: " +rev);


        StringBuffer bf = new StringBuffer(String.valueOf(num));
        StringBuffer sb = bf.reverse();                                        //String & num
        System.out.println("After reverse the value is : " + sb);


        StringBuilder bs = new StringBuilder();
        sb.append(num);
        StringBuilder numm= bs.reverse();
        System.out.println("rev number is  " +numm);
    }}