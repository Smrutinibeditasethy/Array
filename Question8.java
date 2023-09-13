package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question8 {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);

        System.out.println("Enter the size : ");
        int num=Integer.parseInt(br.readLine());

        System.out.println("Enter the size 2 : ");
        int num2= Integer.parseInt(br.readLine());

        if (num != num2){
            System.out.println("The two arrays are not equal. ");
            return;
        }

        int[] myNum= new int[num];
        System.out.println("Enter the array elements : ");
        for (int i= 0; i< myNum.length; i++){
            myNum[i]= Integer.parseInt(br.readLine());
        }


        int[] myNum2= new int[num2];
        System.out.println("Enter the array elements : ");
        for (int i= 0; i< myNum2.length; i++){
            myNum2[i]= Integer.parseInt(br.readLine());
        }

        if (myNum == myNum2){
            System.out.println("The two arrays are equal.");
        }
        else System.out.println("The two arrays are not equal.");


    }
}
