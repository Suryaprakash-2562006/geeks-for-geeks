class Solution {
    public int greatestOfThree(int a, int b, int c) {
        int max = a;  // assume a is greatest
        
        if (b > max) {
            max = b;
        }
        
        if (c > max) {
            max = c;
        }
        
        return max;
    }
}