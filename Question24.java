package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question24 {
    public static void main(String[] args) throws IOException {
        int[] myData = {2, 4, 7, 2, 89, 56, 34, 2, 5, 6, 12, 7, 89, 23, 45, 2};
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter a value :");
        int value = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < myData.length; i++) {
            if (myData[i] == value) {
                count++;
            }
        }
        System.out.println("Total number of times the value is present= " + count);
        if (count == 0) {
            System.out.println("The value is not present");


        }
    }
}
