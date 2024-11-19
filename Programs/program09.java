import java.util.Scanner;
public class program09 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers one after another: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1>num2){
            if(num1>num3){
                System.out.println(num1+" is greatest number");
            }
            else{
                System.out.println(num3+" is greatest number");
            }
        }
        else{
            System.out.println(num2+" is greatest number");
        }
        sc.close();
    }
}
