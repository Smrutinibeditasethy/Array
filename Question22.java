package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question22 {
    public static void main(String[] args) throws IOException {
        int[] myData = {2, -4, 7, 2, 88, 56, -34, 4, 5, 6, 12, -7, 89, 23, 45, 2, -5, -86, 3, -23, 78};
        System.out.println("The original array : " + Arrays.toString(myData));
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);

        System.out.println("Enter the no of value you need to add : " );
        int value=  Integer.parseInt(br.readLine());
        int[] newData= new int[value];
        System.out.println("Enter the values : ");
        for (int i= 0; i< newData.length; i++){
            newData[i]= Integer.parseInt(br.readLine());
        }
        int[] update = new int[myData.length+ newData.length];

        for (int i = 0; i< myData.length; i++){
            update[i]= myData[i];
        }
        int i, j;
        for( i=0, j=myData.length; j<(myData.length + newData.length);
             j++, i++) {
            update[j] = newData[i];
        }
        System.out.println("The updated array  : " +Arrays.toString(update));
    }
}
