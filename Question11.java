package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question11 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        int store;

        System.out.println("Enter the size : ");
        int num=Integer.parseInt(br.readLine());
        int[] myNum= new int[num];
        System.out.println("Enter the array elements : ");
        for (int i= 0; i< myNum.length; i++){
            myNum[i]= Integer.parseInt(br.readLine());
        }


        System.out.println("Enter the size 2 : ");
        int num2= Integer.parseInt(br.readLine());
        int[] myNum2= new int[num2];
        System.out.println("Enter the array elements : ");
        for (int i= 0; i< myNum2.length; i++){
            myNum2[i]= Integer.parseInt(br.readLine());
        }

        int[] merge = new int[myNum.length+ myNum2.length];

        for (int i = 0; i< myNum.length; i++){
            merge[i]= myNum[i];
        }

        int i, j;
        for( i=0, j=myNum.length; j<(myNum.length + myNum2.length);
             j++, i++) {
            merge[j] = myNum2[i];
        }

        System.out.println("The merge array : " + Arrays.toString(merge));

        for (int a=0; a <merge.length; a++) {
            for (int b = a + 1; b < merge.length; b++) {
                if (merge[a] > merge[b]) {
                    store = merge[b];
                    merge[b] = merge[a];
                    merge[a] = store;
                }
            }
        }
        System.out.println("The sorted Array : " +Arrays.toString(merge));

    }
}
