package Array;

import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] array  =  {1,2,3,4,5,6,7};

        leftRotateByOne(array);
        System.out.println(Arrays.toString(array));
    }

    private static void leftRotateByOne(int[] array) {
        int temp = array[0];

        for (int i = 1; i < array.length; i++) {
            array[i-1] = array[i];
        }
        array[array.length-1] = temp;
    }
}
