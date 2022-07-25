class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0; i<sentences.length; i++){
            String [] splitter = sentences[i].split("\\s+");
            if (splitter.length>max){
                max = splitter.length;
            }
        }
        return max;
    }
    
}