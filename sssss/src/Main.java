import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<>(n);
        for(int i = 0; i<n; i++){
            nums.add(in.nextInt());
        }
        int max = nums.get(0);
        for(int i = 0; i<nums.size(); i++){
            if (nums.get(i)>max){
                max = nums.get(i);
            }
        }
        nums.remove(Integer.valueOf(max));
        max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        } System.out.println(max);
    }
}