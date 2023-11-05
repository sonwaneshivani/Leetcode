// class Solution {
//     public boolean isValid(StringBuilder str){
//         HashSet<Character> uniqueChars = new HashSet<>();
//         for (int i = 0; i < str.length(); i++) {
//             char currentChar = str.charAt(i);
//             if (uniqueChars.contains(currentChar)) {
//                 return false;
//             }
//             uniqueChars.add(currentChar);
//         }
//         return true;
//     }
//     public int lengthOfLongestSubstring(String s) {
//         int ans=0;
//         for(int i=0;i<s.length();i++){
//             StringBuilder str=new StringBuilder("");
//             for(int j=i;j<s.length();j++){
//                 str.append(s.charAt(j));
//                 if(isValid(str)) ans=Math.max(ans,str.length());
//             }
//         }
//         return ans;
//     }
// }

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> uniqueChars = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLength = 0;
        
        while (right < s.length()) {
            char currentChar = s.charAt(right);
            
            if (uniqueChars.contains(currentChar)) {
                uniqueChars.remove(s.charAt(left));
                left++;
            } else {
                uniqueChars.add(currentChar);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            }
        }
        
        return maxLength;
    }
}
