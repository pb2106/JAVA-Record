public class program02 {
    public static void main(String args[]){
        int n = 15;
        int a = 0;
        int b = 1;
        for(int i=0;i<=n;i++){
            System.out.print(a+","+b+",");
            a = a+b;
            b = b+a;
        }
    }
}
