package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Total number of students : ");
        int num = Integer.parseInt(br.readLine());

        int[] rollNum= new int[num];
        System.out.println("The roll Number :");
        for (int i = 0; i <num; i++) {
            rollNum[i]= Integer.parseInt(br.readLine());
        }
        System.out.println("The total roll number : ");
       for (int i=0; i<num; i++){
           System.out.print(rollNum[i]+"\t");
        }
    }
}