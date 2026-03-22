// User function Template for Java
class Solution {
    static ArrayList<Integer> getSum(int N) {
        // code here
        
        int oddsum = 0;
        int evensum = 0;
        
        ArrayList<Integer> result = new ArrayList<>();
        
        
        for(int i=1;i<=N;i++)
        {
            if(i % 2 == 0)
            {
                evensum+=i;
            }
            else
            {
                oddsum+=i;
            }
        }
        
        //ArrayList<Integer> result = new ArrayList<>();
        
        result.add(evensum);
        result.add(oddsum);
        
        
        return result;
    }
}