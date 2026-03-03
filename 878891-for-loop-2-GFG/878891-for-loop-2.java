class Solution {
    public void printEvenIndices(String s) {
        // code here
        
        for(int i=0;i<s.length();i+=2)
        {
            char ch = s.charAt(i);
            System.out.print(ch);
        }
    }
}