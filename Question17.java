package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question17 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        int GCD=0;

        System.out.println("Enter the first number: ");
        int num1= Integer.parseInt(br.readLine());

        System.out.println("Enter the second number: ");
        int num2 = Integer.parseInt(br.readLine());

        for (int i= 1; i<=num1 || i<=num2; i++){
            if (num1%i==0 && num2%i==0){
                GCD= i;
            }
        }System.out.println("The GCD of the 2 numbers : " +GCD);





    }
}
