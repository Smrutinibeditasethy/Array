package array;

import java.util.Arrays;

public class Question32 {
    public static void main(String[] args) {
        int[] myData = {2, -4, 7, 2, 88, 56, -34, 4, 5, 6, 12, -7, 89, 23, 45, 2, -5, -86, 3, -23, 78};
        int positivecount = 0;
        int negativecount = 0;
        for (int i = 0; i < myData.length; i++) {
            if (myData[i] < 0) {
                negativecount++;
            }else
                positivecount++;
        }
        int[] negData = new int[negativecount];
        int[] posData = new int[positivecount];
        int count = 0;

        for (int i=0; i< myData.length; i++) {
            if (myData[i] < 0 ){
                negData[count] = myData[i];
                count++;
            }
        }
        int count1 = 0;
        for (int i=0; i< myData.length; i++) {
            if (myData[i] > 0 ){
                posData[count1] = myData[i];
                count1++;
            }
        }


        System.out.println("The orignal array : " + Arrays.toString(myData));
        System.out.println("The negative array : " +Arrays.toString(negData));
        System.out.println("The positive array : " +Arrays.toString(posData));
    }
}

