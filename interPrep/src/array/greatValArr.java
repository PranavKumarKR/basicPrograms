package array;
import java.util.Arrays;
public class greatValArr {
    public static void main(String[] args) {
        int array[] = {10, 20, 25, 63, 96, 57};

        int size = array.length;
        Arrays.sort(array);                                             //sort , second largest
        System.out.println("sorted Array ::"+Arrays.toString(array));
        int res = array[size-2];
        System.out.println("2nd largest element is ::"+res);

        System.out.println("------------------------------------------------------------------");

        int []ar = {12,14,567,123,900};
        int max = ar[0];
        for (int i = 1; i <ar.length ; i++) {
            if(ar[i]>max){
                max= ar[i];
                                                                  // greatest , smallest  number
        }}
        System.out.println("the greatest num in arr is :" +max);
    }}
