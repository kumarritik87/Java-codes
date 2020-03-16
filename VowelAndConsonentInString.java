import java.util.Scanner;
public class VowelAndConsonentInString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vowelcount = 0;
        int consonentcount = 0;
        System.out.println("Enter the String : - ");
        String s1 = sc.next();
        String s2 = s1.toLowerCase();
        for(int i = 0; i<s1.length(); i++){
            if(s2.charAt(i) == 'a'|| s1.charAt(i) == 'e'||s1.charAt(i) == 'i'||s1.charAt(i) == 'o'||s1.charAt(i) == 'u'){
                vowelcount++;
            }
            else if(s2.charAt(i)>'a' && s2.charAt(i)<'z'){
                consonentcount++;
            }
        }
        System.out.println("Vowel = " +  vowelcount + " Consonent = "+consonentcount);
    }
}
