import java.util.Scanner;

public class program10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int num1 = sc.nextInt();
        
        if ((num1 % 4 == 0 && num1 % 100 != 0) || (num1 % 400 == 0)) {
            System.out.println(num1 + " is a leap year");
        } else {
            System.out.println(num1 + " is not a leap year");
        }
        sc.close(); 
    }
}