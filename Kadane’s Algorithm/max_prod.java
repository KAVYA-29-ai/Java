import java.util.Scanner;

public class max_prod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for(int i= 0 ; i< n;i++){
            nums[i] = sc.nextInt();
        }

        System.err.println(maxproduct(nums));

        sc.close();
    }
    public static int maxproduct(int[] nums){
        int n = nums.length;
        int max = nums[0] , min = nums[0] , result = nums[0];

        for(int i = 1 ; i< n ; i++){
            if(nums[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(nums[i] , max*nums[i]);
            min = Math.min(nums[i] , min*nums[i]);

            result = Math.max(result, max);

        }
         return result;
    }

}
