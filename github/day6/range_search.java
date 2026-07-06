package day6;

public class range_search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key=6;
        int found=-1;
        int start = 3;
        int stop = 7;
        for(int i=start;i<=stop;i++){
            if(i==key){
                found=key;
            }
        }
        if(found==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at index "+found);
        }

    }
}