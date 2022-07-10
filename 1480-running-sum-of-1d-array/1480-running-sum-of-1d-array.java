class Solution {
    public int[] runningSum(int[] nums) {
        int a = nums.length;
        int count=0;
        int[] newarray = new int[a];
        
        for(int i=0; i<a; i++){
          count = nums[i] + count;
          newarray[i]=count;
        }
        return newarray;
    }
}