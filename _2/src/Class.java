import java.util.*;

public class Class{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] nums = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                nums[i][j]=in.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            int max = nums[0][j];
            for(int j=0; j<n; j++){
                if(max<nums[i][j]){
                    max=nums[i][j];
                }
            }System.out.println(max);
        }
    }
}