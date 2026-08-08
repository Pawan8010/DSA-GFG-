class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
                int sum=0;
        // int max=0;

        for(int i=0;i<k;i++){
            // if((nums[i]!=nums[i-1])){
                  sum+=arr[i];
            // }
          
        }
        int max=sum;
        int left=0;
        int r=k;
        while(r<arr.length){
            sum-=arr[left];
            left++;
            
            // if(nums[r]!=nums[r-1]){
                sum+=arr[r];
            // }
            
            r++;
            max=Math.max(sum,max);
        }
        return max;
    }
}