package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question5 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        System.out.println("Enter the number in array: ");
        int num= Integer.parseInt(br.readLine());

        int[] myNum= new int[num];
        System.out.println("Enter the array : ");
        for (int i=0; i<num; i++){
            myNum[i] = Integer.parseInt(br.readLine());
        }
        int sum;
        sum = 0;
        for (int i=0; i< myNum.length; i++){
            sum= sum+myNum[i];
        }
        System.out.println("The sum of the array :  " +sum);
    }
}
