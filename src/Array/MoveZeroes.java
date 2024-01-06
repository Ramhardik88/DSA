package Array;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] array = {1,2,0,0,1,3,5,4,0,0,4,8,9,0,3};
        moveZeros(array,array.length);
        System.out.println(Arrays.toString(array));
    }

    private static void moveZeros(int[] array, int length) {
        int j = -1;
        for (int i = 0; i < length; i++) {
            if(array[i]==0)
            {
                j=i;
                break;
            }
        }

        if(j==-1) return ;

        for (int i = j+1; i < length ; i++) {

            if(array[i]!=0){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }

        }
    }

}
