class Solution 
{
    public String booleanOperations(boolean a, boolean b) 
    {
        boolean isTrue = false;
        
        
        String str1 = (a&&b) ? "true" : "false";
        String str2 = (a||b) ? "true" : "false";
        String str3 = (!a) ? "true" : "false";
        
        String s = (str1 + " " + str2 + " " + str3);
        
        return s;
    }
}