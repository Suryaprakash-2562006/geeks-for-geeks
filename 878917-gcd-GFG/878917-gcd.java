class Solution {
    public int computeGCD(int a, int b) {
        int gcd = 1;

        for(int i = 1; i <= Math.min(a, b); i++) {
            if(a % i == 0 && b % i == 0) {
                gcd = i; // keep updating
            }
        }

        return gcd;
    }
}