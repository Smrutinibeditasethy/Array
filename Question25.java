package array;

public class Question25 {
    public static void main(String[] args) {
        int[] myData = {2, 4, 7, 2, 88, 56, 34, 2, 5, 6, 12, 7, 89, 23, 45, 2};

        int count= 0;
        int count1=0;

        for (int i=0; i< myData.length; i++){
            if (myData[i] %2==0){
                count++;
            }else
                count1++;
            }
        System.out.println("The total no of odd numbers : " +count);
        System.out.println("The total no of even numbers : " +count1);
        }


    }
