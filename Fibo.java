import java.util.Scanner;


public class Fibo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0, b  = 1, c;
        System.out.println("Enter the number upto which you want to print the series:-");
        int n = sc.nextInt();
        System.out.print(a +" "+b);
        for (int i = 2; i<n; i++){
            c = a +b;
            System.out.print(" "+c);
            a = b;
            b = c;
            
        }
    }
}
