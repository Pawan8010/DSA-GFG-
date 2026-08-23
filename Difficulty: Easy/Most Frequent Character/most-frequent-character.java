class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        
        HashMap<Character,Integer>map=new HashMap<>();
        
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        // fidigng the maximum time appearing char
        
        int max=0;
        
        for( int count:map.values()){
            if(count>max){
                max=count;
            }
        }
        
    char ans=Character.MAX_VALUE;
        
        for(Map.Entry<Character,Integer>e:map.entrySet()){
            if(e.getValue()==max){
                if(e.getKey()<ans){
                    ans=e.getKey();
                }
            }
            
        }
        return ans;
        

        
        
        
        
      /*
      steps
      
      find the max freq char
      if more that 1 then comare lexicographic order
      
      output
      o->1
      u->2
      t->2
      p->1    
      
      ut
       if(charAt(i)-a<small){
           small=charAt(i);
       }
      */
    }
}