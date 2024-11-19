public class program8 {
    public static void main(String args[]){
        int arr[] =  {3,5,6,0,3,0,0,2,2,3};
        int temp[] =  new int[arr.length];
        int len = arr.length;
        int count =0;
        for(int i=0;i<len;i++){
            if(arr[i]!=0){
                temp[count]=arr[i];
                count++;
            }
        }
        while(count<len){
            temp[count] = 0;
            count++;
        }
        System.out.print("Array After arrangement: ");
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+",");
        }
        
    }
}
