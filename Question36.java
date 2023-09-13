package array;


import java.util.Arrays;

public class Question36 {
    public static void main(String[] args) {
        int[] myData = {2, -4, 7, 2, 88, 56, -34, 4, 5, 6, 12, -7, 89, 23, 45, 2, -5, -86, 3, -23, 78};
        System.out.println("The array : " + Arrays.toString(myData));
        int total = 0;
        int average;
         for (int i = 0; i< myData.length; i++){
             total= total + myData[i];
         }
         average = total/ myData.length;
        int size = 0;
        for (int i = 0 ; i< myData.length; i++){
            if (average < myData[i] ){
                size++;
            }
        }
        int[] arr = new int[size];
        int count = 0;
        for (int i = 0 ; i< myData.length; i++){
            if (average < myData[i] ){
                arr[count] = myData[i];
                count++;
            }
        }System.out.println("The new array : " + Arrays.toString(arr));


    }
}
