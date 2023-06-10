#https://leetcode.com/problems/valid-anagram/description/
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

     HashMap<Character,Integer> h1 = new HashMap<>();
     HashMap<Character,Integer> h2 = new HashMap<>();
      for(int i=0;i<s.length();++i){
          if(h1.get(s.charAt(i))==null){
              h1.put(s.charAt(i),1);
          }
          else
          h1.put(s.charAt(i),h1.get(s.charAt(i))+1);
      }
      for(int i=0;i<t.length();++i){
         if(h2.get(t.charAt(i))==null){
              h2.put(t.charAt(i),1);
          }
          else
          h2.put(t.charAt(i),h2.get(t.charAt(i))+1);
      }
      if(h1.equals(h2)){
          return true;
      }
      else
      return false;
         
     }
}   

