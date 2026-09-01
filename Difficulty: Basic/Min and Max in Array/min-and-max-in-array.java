class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int n=arr.length;
        ArrayList<Integer>list=new ArrayList<>();
        Arrays.sort(arr);
        list.add(arr[0]);
        list.add(arr[n-1]);
        return list;
    }
}
