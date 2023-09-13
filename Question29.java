package array;

import java.util.Arrays;

public class Question29 {
    public static void main(String[] args) {
        int[] myData = {2, 4, 7, 2, 88, 56, 34, 2, 5, 6, 12, 7, 89, 23, 45, 2};
        int store = 0;
        for (int i = 0; i < myData.length; i++) {
            if (myData[i] % 2 == 0) {
                store++;

            }
        }
        int[] myData2 = new int[store];
        int count= 0;
        for (int i =0; i< myData.length; i++){
            if (myData[i] %2 ==0){
                myData2[count]= myData[i];
                count++;
            }
        }
        System.out.println("The new even array : " +Arrays.toString(myData2));
            }
        }
