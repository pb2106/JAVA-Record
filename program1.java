public class program1{
    public static void main(String args[]){
        int n = 10;
        int a = 0;
        int b = 1;
        for(int i=0;i<=n;i++){
            a = a+b;
            b = b+a;
            if (i==n){
                System.out.println(b);
            }
        }
    }
}