package array;

public class Question34 {
    public static void main(String[] args) {
        int[] myData = {2, -4, 7, 2, 88, 56, -34, 4, 5, 6, 12, -7, 89, 23, 45, 2, -5, -86, 3, -23, 78};
        int sum = 0;

        for (int i =0; i< myData.length; i++){
                sum= sum +myData[i];
                System.out.println("Sum : " +sum);
            }System.out.println("The sum of the positive numbers : " +sum);
        }
    }
