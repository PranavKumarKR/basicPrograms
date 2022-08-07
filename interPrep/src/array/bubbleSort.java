package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class bubbleSort {

    //many inBuild sorting methods
//        Arrays.parallelSort(arr);
//        Arrays.sort(arr);
//        Arrays.sort(arr, Collections.reverseOrder());
//        System.out.println("after sorting values are :" + Arrays.toString(arr))

    public static void main(String[] args) {
        Integer[] arr = {1, 24, 6, 7, 9, 10};
        int n = arr.length;
        System.out.println("the array before sorting :" + Arrays.toString(arr));

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        System.out.println("after sorting values are :" + Arrays.toString(arr));
    }}






