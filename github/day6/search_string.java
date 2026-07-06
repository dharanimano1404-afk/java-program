package day6;

public class search_string {
    public static void main(String[] args) {
        String name ="hello world";
        char key='o';
        char[] arr=name.toCharArray();
        int a=search(arr,key);
        if(a==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found");
        }
    }
    static int search(char [] arr,char key){
        for(char num:arr){
            if(num==key){
                return 1;
            }
        }
        return -1;
    }
}
