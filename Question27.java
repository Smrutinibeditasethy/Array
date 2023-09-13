package array;

import java.util.Arrays;

public class Question27 {
    public static void main(String[] args) {
        int[] myData = {2, 4, 7, 2, 88, 56, 34, 4, 5, 6, 12, 7, 89, 23, 45, 2, 5, 86, 3, 23, 78};
        System.out.println("The original array : " +Arrays.toString(myData));
        for (int i= 0; i< myData.length; i++){
            if (myData[i] % 2==0){
                System.out.println("Even : " +myData[i]);
            }else
                System.out.println("Odd : " +myData[i]);
        }
    }
}
