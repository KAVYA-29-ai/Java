import java.util.*;

public class max_sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i< n ; i++){
            nums[i] = sc.nextInt();
        }
        int result = maxsumArray(nums);
        System.out.println(result);

        sc.close();

    }

    public static int maxsumArray(int[] nums){
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int currentmax = 0;


        for(int i = 0; i< n;i++){
            currentmax=Math.max(nums[i] , currentmax+nums[i]);
            max =Math.max(max, currentmax);
        }

        return max;
    }
}