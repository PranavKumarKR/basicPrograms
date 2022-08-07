public class Swapping {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("  before swapping values are : " + a + "  " + b);

//        int t = a;
//            a =b;                                       // m1  using third variable
//            b=t;
//        System.out.println("after swapping values are :" +a+"  "+b);


//        a = a + b;
//        b = a - b;
//        a = a - b;
                                                        // without using third variable

//        a = a * b;
//        b = a / b;
//       a = a / b;



         b= a+b-(a=b);                               //math

        System.out.println("after swapping values are :" + a + "  " + b);

    }}