//№1
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int count = 0;
//        int[] nums = new int[n];
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = in.nextInt();
//        }int result = notZero(nums);
//        System.out.println(result);
//    }
//    public static int notZero(int[] nums) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != 0) {
//                count++;
//            }
//        }return count;
//    }
//}




//№2
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        int result = getMax(a, b, c);
//        System.out.println(result);
//    }
//    public static int getMax(int a, int b, int c) {
//        if (a > b && a > c) {
//            return a;
//        } else if (b > a && b > c) {
//            return b;
//        } else {
//            return c;
//        }
//    }
//}




//№3
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s1 = in.next();
//        String s2 = in.next();
//        str(s1, s2);
//    }
//
//    public static void str(String s1, String s2){
//        if(s1.contains(s2)){
//            System.out.println("yes");
//        }else{
//            System.out.println("no");
//        }
//    }
//}



//№4
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String login = in.next();
//        String password = in.next();
//        String result = lp(login, password);
//        System.out.println(result);
//    }
//    public static String lp(String login, String password) {
//            if(login.equals("admin") && password.equals("qwerty")){
//                return "Authentication completed";
//            }else{
//                return "Invalid login or password";
//            }
//        }
//    }



//№5
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i< nums.length; i++){
            nums[i]=in.nextInt();
        }double result = getMedium(nums);
        System.out.println(result);
    }
    public static double getMedium(int[] nums){
        double sum = 0;
        int count = 0;
        double medium = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                sum += nums[i];
                count++;
                medium = sum/count;
            }
        }return medium;
    }
}