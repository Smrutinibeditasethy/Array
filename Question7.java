package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question7 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);

        System.out.println("Enter the first number :");
        int num= Integer.parseInt(br.readLine());
        int[] myNum= new int[num];
        System.out.println("Enter the first numbers : ");
        for (int i=0; i<num; i++){
            myNum[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the second number :");
        int num2= Integer.parseInt(br.readLine());
        int[] myNum2= new int[num2];
        System.out.println("Enter the second numbers : ");
        for (int i=0; i<num2; i++){
            myNum2[i] = Integer.parseInt(br.readLine());
        }

        if (num != num2){
            System.out.println("Please enter same size");
            return;
        }

        int num3= myNum.length;
        int[] myNum3= new int[num3];
        for (int i=0; i< num3;i++){
            myNum3[i]= myNum[i]+myNum2[i];
        }



        System.out.println("Sum of the two numbers :");
        for (int i=0; i<num3; i++){
            System.out.print(myNum3[i] + " ");
        }


    }
}
