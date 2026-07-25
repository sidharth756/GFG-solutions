class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int n = arr.length;
        int maxisum = 0;
        int sum =0;
        for(int i=0;i<k;i++){
            sum = sum + arr[i];
        }
        maxisum = Math.max(maxisum,sum);
        for(int j=k;j<n;j++){
            sum -= arr[j-k];
            sum += arr[j];
            maxisum = Math.max(maxisum,sum);
        }
        return maxisum;
    }
}