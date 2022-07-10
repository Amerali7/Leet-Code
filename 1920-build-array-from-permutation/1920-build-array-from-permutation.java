class Solution {
    public int[] buildArray(int[] nums) {
      var ans = new int[nums.length];
	for (var i = 0; i < nums.length; i++)
		ans[i] = nums[nums[i]];
	return ans;  
    }
}