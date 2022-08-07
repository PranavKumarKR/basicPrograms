package array;

public class LinearSearch {
        public static void main(String[] args) {
            int[] arr = {20, 30, 40, 50, 60};
            boolean flag = false;
            int search_val = 40;

            for (int i = 0; i < arr.length; i++) {
                if (search_val == arr[i]) {
                    System.out.println("the element found in : " + i);
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println("th element not found");
            }
        }}

