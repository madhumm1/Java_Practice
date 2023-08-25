package com.javapractice;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        char charArray[]=s.toCharArray();
        for(int i=0;i<charArray.length();i++){
            if(charArray[i]==charArray[i+1]){
                return 0;
            }
        
        }
        
        return System.out.println(length);

        
    }
    public static void main(String args[]){
        Solution solution=new Solution();
        String s;
        int lenOfSubStr= solution.lengthOfLongestSubstring(s);
        System.out.println("The output is:"+ lenOfSubStr);
    }
    

}



#INCOMPLETE