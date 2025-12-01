import java.util.*;

public class max_cont {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i = 0 ; i< nums.length ; i++){
            nums[i] = sc.nextInt();
        }

        int[] ans = subarray(nums);

        System.out.println("Start: " + ans[0]);
        System.out.println("End: " + ans[1]);
        System.out.println("Max Sum: " + ans[2]);
        sc.close();
    }

    public static  int[]  subarray(int[] nums){
        int currentmax = nums[0] ,  max = nums[0];
        int start = 0 ,  end = 0 , tempstart  =0;

        for(int i = 0; i<nums.length ; i++){
            if(nums[i] > currentmax + nums[i]){
                currentmax= nums[i];
                tempstart = i;
            }
            else{
                currentmax += nums[i];
            }

            if(currentmax > max){
                max = currentmax;
                start = tempstart;
                end =i;
            }
        }
        return new int[]{start ,end , max};
    }
}
