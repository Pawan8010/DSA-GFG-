class Solution {
    public int kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        // PriorityQueue<Integer>q=new PriorityQueue<>();
        // for(int num:arr){
        //     q.add(num);
        // }
        // int count=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            k--;
            if(k==0){
                ans=arr[i];
                
            }
        }
        return ans;
    }
}
