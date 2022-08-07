import java.util.Random;

public class randomNum {
    public static void main(String[] args) {
        System.out.println(Math.random());                  //m1

        Random rand = new Random();
        int  rand_int = rand.nextInt(10);            //m2
        System.out.println(rand_int);
    }
}
