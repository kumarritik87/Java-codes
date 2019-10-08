/*  java program to print pattern of right angled triangle :- 
*
* *
* * *
* * * *
* * * * *
* * * * * * 
* * * * * * *                                                */


public class Pattern1{
    public static void main(String[] args){
        int i, j, n = 7;
        for(int a = 0; a<n; a++){
            for(int b = 0; b<=a; b++){
                System.out.print(" *");
                
            }
            System.out.println("");
        }
    }
}
