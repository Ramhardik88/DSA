package Array;

import java.util.Arrays;




public class LeftRotateByKTimes {
    public static void main(String[] args) {
        int[] array  =  {1,2,3,4,5,6,7};
        int k =3;

        //      leftRotateByKTimes(array,k);

        //   leftRotateByKTimesInTemp(array,k);

        leftRotateByKTimesInRev(array,array.length,k);
        System.out.println(Arrays.toString(array));
    }

    private static void leftRotateByKTimesInRev(int[] array,int n, int k) {
        reverse(array,0,n-k-1);
        reverse(array,n-k,n-1);
        reverse(array,0,n-1);
    }

    private static void reverse(int arr[],int start, int end){
        while (start<= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }



    private static void leftRotateByKTimesInTemp(int[] array, int k) {
         k = k% array.length;

         int n = array.length;

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = array[i];
        }


        for (int i = k; i < n; i++) {
            array[i-k] = array[i];
        }


        for (int i = n-k; i < n; i++) {
            array[i] = temp[i-(n-k)];
        }

    }

    private static void leftRotateByKTimes(int[] array,int k) {
        for (int ind = 0; ind < k; ind++) {
            int temp = array[0];
            for (int i = 1; i < array.length; i++) {
                array[i - 1] = array[i];
            }
            array[array.length - 1] = temp;
        }
    }
}
