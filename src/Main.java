import java.util.Arrays;



public class Main {


    public static void reverse(int[] test1) {
        int[] temp = new int[test1.length];

        for (int i = 0; i < test1.length; i++) {
            temp[test1.length - 1 - i] = test1[i];
        }

        for (int i = 0; i < test1.length; i++) {
            test1[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 6, 8, 4, 5};
        reverse(test1);
        System.out.println(Arrays.toString(test1));
    }
}

        /* reverse(test1);
        System.out.println(Arrays.toString(test1));*/



