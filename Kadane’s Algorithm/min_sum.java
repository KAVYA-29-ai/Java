import java.util.*;

public class min_sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i< n ; i++){
            nums[i] = sc.nextInt();
        }
        int result = minsumArray(nums);
        System.out.println(result);

        sc.close();

    }

    public static int minsumArray(int[] nums){
        int n = nums.length;
        int min = nums[0];
        int currentmin = nums[0];


        for(int i = 0; i< n;i++){
            currentmin=Math.min(nums[i] , currentmin+nums[i]);
            min =Math.min(min , currentmin);
        }

        return min;
    }
}
