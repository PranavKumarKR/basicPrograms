import java.util.Scanner;

public class Plindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the value: ");
        int num  = in.nextInt();
        int org_num = num;
        int rev =0;
        while (num!=0){
            rev=rev*10 + num%10;
            num = num/10;
        }
        if (org_num==rev)
            System.out.println("it ia a palindrome");
        else
            System.out.println("it is not a palindrome ");
    }
}
