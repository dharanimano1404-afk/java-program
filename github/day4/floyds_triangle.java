package day4;

public class floyds_triangle {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print( (i * (i - 1) / 2 + 1)+j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
