package array;

public class Question3 {
    public static int[] oldArrayMethod(){
        int [] oldArray= new int[6]; // oldArray[0,0,0,0,0,0]
        oldArray[0]= 15;
        oldArray[1]= 56;
        oldArray[2]= 76;
        oldArray[3]= 87;
        oldArray[4]= 31;
        oldArray[5]= 90;
        // oldArray[15,56,76,87,31,90]
        return oldArray;
    }

    public static void main(String[] args) {
        int[] newArray = oldArrayMethod();
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + "\t");
        }
    }
}