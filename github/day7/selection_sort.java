package day7;

public class selection_sort {
    public static void main(String[] args){
        int[] arr={1,3,4,2,5};
        selection(arr);
        System.out.println(arr+" ");
    }
    static void selection(int[] arr){
        int min=0;
        int n=arr.length-1;
        for(int i=0;i<n;i++){
            min=i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[i]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

    }
}
