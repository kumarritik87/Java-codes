import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversing {
    public void ArrayReverse(){

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter the "+i+" value of array");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is  " + Arrays.toString(arr));
        System.out.print("Array in reverse order is : [");
        for (int i = arr.length-1; i>=0; i--) {
            System.out.print( arr[i]+ ", ");
        }
        System.out.println("]\n");
    }

    public static void main(String[] args) {
        ArrayReversing ar = new ArrayReversing();
        ar.ArrayReverse();
    }
}
