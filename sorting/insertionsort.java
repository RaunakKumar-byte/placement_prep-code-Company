public class insertionsort{

    public static void main(String[] args){
        int[] arr={13,46,24,52,20,9};
        int n=arr.length;

        for(int i=1;i<n-1;i++){
           int curr=arr[i];
           int prev=i-1;

           while(prev>=0 && arr[prev]>key){
            arr[prev+1]=arr[prev];
            prev--

           }

           arr[prev+1]=curr;
        }

        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}