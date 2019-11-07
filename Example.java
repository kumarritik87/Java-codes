package regexDemo;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;


    public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = sc.next();
        System.out.println("Enter last name");
        String lastName = sc.next();
        System.out.println("enter branch code");
        String branchCode= sc.next();
        System.out.println("Enter year of joining");
        int yearOfJoining = sc.nextInt();
        String firstName1 = firstName.toLowerCase();
        String lastName1 = lastName.toLowerCase();

        System.out.println(firstName1+ "."+ lastName1 + "_"+ branchCode+""+yearOfJoining+"@gla.ac.in");
        System.out.println("Enter emailId :- ");
        String emailId = sc.next();

        Pattern pattern = Pattern.compile(firstName1 + "."+ lastName1+ "_"+ branchCode+""+yearOfJoining+"@gla.ac.in");
        Matcher matcher = pattern.matcher(emailId);
        System.out.println(matcher.matches());
    }
}
