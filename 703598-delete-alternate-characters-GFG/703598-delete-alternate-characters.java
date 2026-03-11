// User function template for Java

class Solution {
    static String delAlternate(String S) {
        //char ch = '';
        // code here
        String ans = new String();
        for(int i=0;i<S.length();i+=2)
        {
            ans += S.charAt(i);
            //System.out.print(ch);
        }
        
        return ans;
    }
}