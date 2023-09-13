package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question6 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        System.out.println("Enter the number of data: ");
        int num= Integer.parseInt(br.readLine());

        int[] myNum= new int[num];
        System.out.println("Enter the data : ");
        for (int i=0; i<num; i++){
            myNum[i] = Integer.parseInt(br.readLine());
        }
        int total= 0;
        int average;
        for (int i=0; i< myNum.length; i++){
            total= total+myNum[i];
        }
        average= total/num;
        System.out.println("The average of the data :  " +average);
    }
}
