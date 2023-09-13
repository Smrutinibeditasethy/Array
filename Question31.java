package array;

import java.util.Arrays;

public class Question31 {
    public static void main(String[] args) {
        int[] myData = {2, -4, 7, 2, 88, 56, -34, 0, 5, 6, 12, -7, 89, 23, 45, 2, 0, -86, 0, -23, 0};
        int negativecount = 0;
        for (int i = 0; i < myData.length; i++) {
            if (myData[i] < 0) {
                negativecount++;
            }
        }
        int[] negData = new int[negativecount];
        int count = 0;
        for (int i=0; i< myData.length; i++) {
            if (myData[i] < 0) {
                negData[count] = myData[i];
                count++;
            }
        }
        System.out.println("The orignal array : " + Arrays.toString(myData));
        System.out.println("The negative array : " +Arrays.toString(negData));
    }
}
