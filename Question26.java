package array;

import java.util.Arrays;

public class Question26 {
    public static void main(String[] args) {
        int[] myData = {2, 4, 7, 2, 88, 56, 34, 4, 5, 6, 12, 7, 89, 23, 45, 2, 5, 86, 3, 23, 78};
        int evencount = 0;
        int oddcount = 0;
        for (int i = 0; i < myData.length; i++) {
            if (myData[i] %2 == 0) {
               evencount++;
            }else
               oddcount++;
        }
        int[] evenData = new int[evencount];
        int[] oddData = new int[oddcount];

        int count = 0;
        for (int i=0; i< myData.length; i++) {
            if (myData[i]%2== 0){
                evenData[count] = myData[i];
                count++;
            }
        }
        int count1 = 0;
        for (int i=0; i< myData.length; i++) {
            if (myData[i]% 2 !=0 ){
                oddData[count1] = myData[i];
                count1++;
            }
        }
        System.out.println("The orignal array : " + Arrays.toString(myData));
        System.out.println("The even array : " +Arrays.toString(evenData));
        System.out.println("The odd array : " +Arrays.toString(oddData));
    }
}
