package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Question18 {
    public static void main(String[] args) throws IOException {
        int[] myData = {2, -4, 7, 2, 88, 56, -34, 4, 5, 6, 12, -7, 89, 23, 45, 2, -5, -86, 3, -23, 78};

        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);

        System.out.println("Enter the value : ");
        int num=  Integer.parseInt(br.readLine());
        int count=0;
        for (int i=0; i<myData.length; i++){
            if (myData[i]==num){
                System.out.println(myData[i]+ " is present in " +i);
                count= count+1;
            }
        }
        if (count==0){
            System.out.println("The value is not found");
        }


    }
}
