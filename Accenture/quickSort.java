
public class quickSort{

    public static quickSort(int[] arr,int st, int end){
        if(st>=){
            return;
        }

        int pivotIndex=partition(arr,st,end);
        quickSort(arr,st,pivotIndex-1);
        quickSort(arr,pivotIndex+1,end);
    }

    public static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;

        return i+1;
    }

}