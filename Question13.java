package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question13 {
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
        for (int i=0; i<myNum.length; i++){
            for (int j=i+1; j<myNum.length; j++){
                if (myNum[i]>myNum[j]){
                    store = myNum[j];
                    myNum[j]=myNum[i];
                    myNum[i]=store;
                }
            }
        }
        System.out.println("The Smallest number in the array is= " +myNum[0]);
    }
}

