package array;

public class sumofElements {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5};
        int sum =0;

//        for (int i =1 ; i <=a.length; i++) {
//            sum=sum+i;
//        }
//        System.out.println("sum of digits is :" +sum);

        for (int value : a) {                          //enhanced for
            sum =sum +value;
        }
        System.out.println("sum of digits is :" +sum);
    }
}
