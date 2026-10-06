import java.util.*;

public class mergeSort{

public static void mergeSort(int[] arr, int st, int end){

    if(left>=right){
        return;
    }

    int mid=st+(end-st)/2;
    //left
    mergeSort(arr,st,mid);
    //right
    mergeSort(arr,mid+1,end);

    //join
    merge(arr,st,mid,end);

}

public static void merge(int[] arr,int st,int mid,int end){

    int i=left;
    int j=mid+1;
    int k=0;

        while(i<=mid && j<=right){

            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }else if(arr[i]>=arr[j]){
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=end){
            temp[k]=arr[j];
            j++;
            k++:
        }

        for(int x=0;x<temp.length;x++){
            arr[left+x]=temp[x];
        }

}

public static void main(String[] args){
    mergeSort(Arr,0,Arr.length-1);
}

}