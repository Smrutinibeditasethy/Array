package array;

public class Question28 {
    public static void main(String[] args) {
        int[] myData = {2, 4, 7, 2, 88, 56, 34, 2, 5, 6, 12, 7, 89, 23, 45, 2};
        int evensum = 0;
        int oddsum = 0;
        for (int i= 0; i< myData.length; i++){
            if (myData[i] % 2==0){
                evensum= evensum+myData[i];
            }else
                oddsum = oddsum+ myData[i];
        }
        System.out.println("The sum of even numbers : " +evensum);
        System.out.println("The sum of odd numbers : " +oddsum);
    }
}
