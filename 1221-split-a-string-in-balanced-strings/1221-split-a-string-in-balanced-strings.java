class Solution {
    public int balancedStringSplit(String s) {
        char [] a = s.toCharArray();
        int R = 0;
        int L = 0;
        int counter=0;
        
        for (int i=0; i<a.length; i++){
            if(a[i]=='R'){
                R++;
            }
            else if(a[i]=='L'){
                L++;
            }
            if (R==L){
                counter++;
                R=0;
                L=0;
            }
            
            
         
        }
        return counter;  
    }
}