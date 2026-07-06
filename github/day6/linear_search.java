package day6;

public class linear_search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int key = 7;
        int a = search(arr, key);
        if (a == -1) {
            System.out.println("not found");
        } else {
            System.out.println("found");
        }

    }

    static int search(int[] arr,int n){
        for(int num:arr){
            if(num==n){
                return 1;
            }

        }
        return -1;
    }

}
