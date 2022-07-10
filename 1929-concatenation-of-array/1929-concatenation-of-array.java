class Solution {
    public int[] getConcatenation(int[] nums) {
       int a =  nums.length;
        int[] num2 = new int[a*2];
        for (int i = 0; i < a; i++) {
            num2[i]= nums[i];
            num2[i+a]= nums[i];
        }

        return num2;
    }
}