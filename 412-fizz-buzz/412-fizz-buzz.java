class Solution {
    public List<String> fizzBuzz(int n) {
        int counter = 0;
            ArrayList<String> val = new ArrayList<String>();
        
        for(int i=1; i<=n;i++){
            if(i%3==0 && i%5==0){
                val.add("FizzBuzz");
                
            }
            else{    
            if(i%3==0){
                val.add("Fizz");
            }
            else if(i%5==0){
                val.add("Buzz");
            }
            else{
                val.add(Integer.toString(i));
            }
            }
            
        }
        
        
     return val;   
    }
}