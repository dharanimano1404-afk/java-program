package day6;

public class linear_search2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int key = 7;
        int index = -1;
        for (int num : arr) {
            if (num == key) {
                index = num;
            }
        }
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("found");
        }
    }
}