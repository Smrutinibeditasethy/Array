package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question16 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        int store;

        System.out.println("Enter the size : ");
        int num=Integer.parseInt(br.readLine());
        int[] orgArr= new int[num];
        System.out.println("Enter the array elements : ");
        for (int i= 0; i< orgArr.length; i++){
            orgArr[i]= Integer.parseInt(br.readLine());
        }
        System.out.println("The orignal array : " + Arrays.toString(orgArr));


        int i, j;
        int[] revArr = new int[num];
         for (i=0, j=num-1; i<num; i++, j--){

             revArr[i] = orgArr[j];
         }
        System.out.println("The reverse array : " +Arrays.toString(revArr));
        }

    }

