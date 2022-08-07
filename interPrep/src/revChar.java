public class revChar {
    public static void main(String[] args) {
        String str = "ABCD";
        String rev = " ";


        int len = str.length();
//        for (int i =len-1; i >=0; i--) {
//            rev= rev + str.charAt(i);
//        }
//        System.out.println("the reverse value is : " +rev);

//        char[] a = str.toCharArray();
//        int len = str.length();                        //array
//        for (int i = len - 1; i >= 0; i--) {
//            rev = rev + a[i];
//        }
//        System.out.println("the reverse value is : " + rev);

        StringBuffer bf = new StringBuffer(str);
        StringBuffer sb = bf.reverse();
        System.out.println("After reverse the value is : " + sb);
    }





    }
