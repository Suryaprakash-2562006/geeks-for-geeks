class Solution {
    int[] getMoreAndLess(int[] arr, int target) {

        int lessOrEqual = 0;
        int greaterOrEqual = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] <= target)
                lessOrEqual++;

            if(arr[i] >= target)
                greaterOrEqual++;
        }

        return new int[]{lessOrEqual, greaterOrEqual};
    }
}