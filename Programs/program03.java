import java.util.Scanner;
class program03 {
    public static void main(String args[]) {
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        boolean isprime = true;
        if (n <= 1) {
            isprime = false;
        } 
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }
        if (isprime) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
        sc.close();
    }
}
