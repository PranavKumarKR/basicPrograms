package array;

public class DupliEle {
    public static void main(String[] args) {
        int [] array = {12,3,4,45,5,4,6,7,9};
                      // array[0]i  array[1]j
        boolean flag = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if(array[i]==array[j]) {
                    System.out.println("Duplicate elements are found in the array is :  "+ array[i]);
                    flag = true;
                }}}
        if(flag==false) {
            System.out.println("there is no Duplicate elements");
        }}}