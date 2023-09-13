package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question35 {
    public static void main(String[] args) throws IOException {
        int[] myData = {2, -4, 7, 2, 88, 56, -34, 4, 5, 6, 12, -7, 89, 23, 45, 2, -5, -86, 3, -23, 78};
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("The array : " +Arrays.toString(myData));

        System.out.println("Enter a value : ");
        int value = Integer.parseInt(br.readLine());

        int size = 0;
        for (int i = 0 ; i< myData.length; i++){
            if (value < myData[i] ){
                size++;
            }
        }

        int[] arr = new int[size];
        int count = 0;
        for (int i = 0 ; i< myData.length; i++){
            if (value < myData[i] ){
                arr[count] = myData[i];
                count++;
            }
        }System.out.println("The new array : " + Arrays.toString(arr));


    }
}
