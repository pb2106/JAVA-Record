public class program13 {
    public static void main(String args[]) {
        int arr[] = {2, 35, 2, 67, 32, 56, 33, 45, 23};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(arr[1] + " is the second largest number");
    }
}
