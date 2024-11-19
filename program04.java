public class program04 {
    boolean prime(int n){
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
            return true;
        } else {
            return false;
        }
    }
    public static void main(String args[]){
        program4 check = new program4();
        int n = 150;
        for(int i = 2;i<n;i++){
            if (check.prime(i)){
                System.out.print(i+",");
            }
        }
    }
}
