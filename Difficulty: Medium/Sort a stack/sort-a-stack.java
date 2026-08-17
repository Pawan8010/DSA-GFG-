class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        int[] arr=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            arr[i]=st.pop();
        }
        Arrays.sort(arr);
         for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }
    }
}