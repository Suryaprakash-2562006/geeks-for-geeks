class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;

        for (int num : arr) {
            // Update largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            // Update second largest
            else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}