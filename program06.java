import java.util.Scanner;
public class program06 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int length = 0;
        while(temp!=0){
            temp/=10;
            length++;
        }
        temp=0;
        for(int i=length-1;i>=0;i--){
            temp+=(num%10)*(Math.pow(10,i));
            num/=10;

        }
        System.out.println(temp);
        sc.close();
    }
}
