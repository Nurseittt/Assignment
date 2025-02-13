/*import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            nums.add(in.nextInt());
        }
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i)/2+" ");
        }
    }
}*/

/*import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0;
        double medium = 0;
        ArrayList<Integer> nums = new ArrayList<>(n);
        for(int i = 0; i<n; i++){
            nums.add(in.nextInt());
        }
        for(int i = 0; i<nums.size(); i++){
            sum+=nums.get(i);
            medium = sum/n;
        }System.out.println(medium);
    }
}*/

/*import java.util.Scanner;
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
}*/

/*import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        ArrayList<Integer> nums = new ArrayList<>(n);
        for(int i = 0; i<n; i++){
            nums.add(in.nextInt());
        }
        for(int i = 0; i<nums.size(); i++){
            if(nums.get(i)>0){
                count++;
            }
        }System.out.print(count);
    }
}*/

/*import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        boolean negative = false;
        while (true) {
            int i = in.nextInt();
            if (i == 0)
                break;
            nums.add(i);
            if (i < 0 && i > max) {
                max = i;
                negative = true;
            }
        }
        for (int i : nums) {
            if (i < 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        if(negative){
            System.out.println(max);
        }
    }
}*/

/*import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int num;
        while ((num = in.nextInt()) != 0) {
            nums.add(num);
        }
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 1) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(nums.get(i)); j++) {
                    if (nums.get(i) % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(nums.get(i) + " ");
                }
            }
        }
    }
}*/

/*import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> numsF = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numsF.add(in.nextInt());
        }
        int m = in.nextInt();
        ArrayList<Integer> numsS = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            numsS.add(in.nextInt());
        }
        Collections.sort(numsF);
        Collections.sort(numsS);

        System.out.println("Sorted first array:");
        for (int i : numsF) {
            System.out.print(i + " ");
        }
        System.out.println("\nSorted second array:");
        for (int i : numsS) {
            System.out.print(i + " ");
        }
        System.out.println();

        ArrayList<Integer> numsT = new ArrayList<>(numsF);
        numsT.addAll(numsS);
        Collections.sort(numsT);

        System.out.println("Sorted third array:");
        for (int i : numsT) {
            System.out.print(i + " ");
        }
    }
}*/

/*import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            String input = scanner.nextLine();
            stringSet.add(input);
        }
        System.out.println(stringSet.size());
    }
}*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            int input = in.nextInt();
            nums.add(input);
        }
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        System.out.println(sum);
    }
}

