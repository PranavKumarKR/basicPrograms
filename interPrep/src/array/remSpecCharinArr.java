package array;


public class remSpecCharinArr {
    public static void main(String[] args) {

        String arr=  " 123456789  latin String  @!#$%^&* ";
        String arr1 = "java java java";

        String s1 =  arr.replaceAll("[^a-zA-Z0-9]","");                //replace junk char

       String s2 = arr.replaceAll("\\s","");                         // removes white spaces
        System.out.println(s1);
        System.out.println(s2);


        int count = arr1.length();
        int  lenAfterRemove = arr1.replace("j","").length();
        int total_count =  count - lenAfterRemove ;                                // count Occurance of char
        System.out.println( total_count);









    }
}
