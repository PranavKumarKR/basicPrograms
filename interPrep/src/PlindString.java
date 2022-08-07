public class PlindString {
    public static void main(String[] args) {
        String str = " ABCCBA";
        String rev  = " " ;
        String org_str = str;
        int leng =  str.length();
        for (int i =leng-1; i >=0 ; i--) {
            rev =rev + str.charAt(i);
        }
        if( org_str.equals(str)){
            System.out.println(" its a palindrome");
        }else {
            System.out.println("it is not a palindrome ");
        }
    }
}
