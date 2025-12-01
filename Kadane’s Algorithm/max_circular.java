import java.util.*;

public class max_circular {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i< n ; i++){
            nums[i] =  sc.nextInt();
        }
        int z = maxsumarray(nums);
        System.out.println(z);

        sc.close();


    }

    public static int maxsumarray(int[] nums){
    int total = 0;
    int maxKadane = nums[0], currMax = nums[0];
    int minKadane = nums[0], currMin = nums[0];

    for (int i = 1; i < nums.length; i++) {
        int x = nums[i];
        currMax = Math.max(x, currMax + x);
        maxKadane = Math.max(maxKadane, currMax);

        currMin = Math.min(x, currMin + x);
        minKadane = Math.min(minKadane, currMin);

        total += x;
    }
    total += nums[0];
    return (maxKadane < 0) ? maxKadane : Math.max(maxKadane, total - minKadane);

    }
}
