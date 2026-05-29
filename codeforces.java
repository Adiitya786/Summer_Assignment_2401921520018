public class codeforces {
    public static void main(String[] args) {
        int arr[]={2,3,5,4,1};
        int nums[] = new int[arr.length];
        int n = arr.length;
        for(int i=0;i<n-3;i++){
            // int max =Integer.MIN_VALUE;
                for(int j =0;j<i+3;j++){
                   nums[i] =Math.max(nums[i],arr[j]);
                }
        }
    
    }
}
