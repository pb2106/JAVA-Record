import java.util.Scanner;
public class program5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        int length = 0;
        
        while(temp!=0){
            temp/=10;
            length++;
        }
        temp = num;
        for(int i=0;i<=length;i++){
            sum += Math.pow((temp%10), 3);
            temp/=10;
        }
        if(sum==num){
            System.out.println(num+" is an armstrong number");
        }
        else{
            System.out.println(num+" is not an armstrong number");
        }
        sc.close();
    }
}
