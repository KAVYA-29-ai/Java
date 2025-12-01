import java.util.*;

public class maxsumdelete {

    public static int maximumSumWithOneDeletion(int[] arr) {
    int n = arr.length;
    int[] forward = new int[n];
    int[] backward = new int[n];

    forward[0] = arr[0];
    for (int i = 1; i < n; i++)
        forward[i] = Math.max(arr[i], forward[i - 1] + arr[i]);

    backward[n - 1] = arr[n - 1];
    for (int i = n - 2; i >= 0; i--)
        backward[i] = Math.max(arr[i], backward[i + 1] + arr[i]);

    int res = arr[0];
    for (int i = 1; i < n - 1; i++)
        res = Math.max(res, forward[i - 1] + backward[i + 1]);

    return Math.max(res, forward[n - 1]);
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0  ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maximumSumWithOneDeletion(arr));
        sc.close();
}

}
