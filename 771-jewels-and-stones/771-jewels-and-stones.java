class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] jewelarray = jewels.toCharArray();
        char[] stonesarray = stones.toCharArray();
        int count = 0;
        for (int i = 0; i < jewelarray.length; i++){
             for (int j = 0; j < stonesarray.length; j++){
                 if (jewelarray[i]==stonesarray[j]){
                     count++;
                 }
             }
        }
        return count;
    }
}