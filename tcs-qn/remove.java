public class remove{


    public static void main(String[] args){
        int[] arr={4,5,0,1,9,0,5,0};


        int index=0;
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }

  for(int left=0;left<arr.length;left++){
            System.out.println(arr[left]);
        }

    }
}