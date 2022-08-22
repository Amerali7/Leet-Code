class Solution {
    public String restoreString(String s, int[] indices) {
        char [] word = s.toCharArray();
        char [] news= new char[word.length];
        int p = 0;
        
        for(int i= 0; i<indices.length; i++) {
            p = indices[i];
            news[p] = word[i];
        }
    String b = new String(news);
    return b;    
    }
}