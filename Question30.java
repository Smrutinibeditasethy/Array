package array;

import java.util.Arrays;

public class Question30 {
    public static void main(String[] args) {
        int[] myData = {2, -4, 7, 2, 88, 56, -34, 0, 5, 6, 12, -7, 89, 23, 45, 2, 0 , -86, 0, -23, 0};
        int positivecount=0 ;
        int negativecount= 0;
        int zerocount= 0;

        for (int i=0; i< myData.length; i++){
            if (myData[i] > 0){
                positivecount++;
            } else if (myData[i] < 0) {
                negativecount++;
            } else
                zerocount++;
        }
        System.out.println("The  array : " + Arrays.toString(myData));
        System.out.println("The total no of positive numbers in array : " +positivecount);
        System.out.println("The total no of negative numbers in array : " +negativecount);
        System.out.println("The total no of zero numbers in array : " +zerocount);
    }
}
