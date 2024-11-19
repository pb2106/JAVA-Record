import java.util.Scanner;
public class program15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if its neon number: ");
        int a = sc.nextInt();
        int sq = a*a;
        int temp =  sq;
        int sum = 0;
        int n =0;
        while(temp!=0){
            temp/=10;
            n++;
        }
        temp =  sq;
        for(int i =0;i<n;i++){
            sum+=(temp%10);
            temp/=10;
        }
        if(sum==a){
            System.out.println(a+" is a neon number");

        }
        else{
            System.out.println(a+" is not a neon number");
        }
        sc.close();
    }
}
