class Geeks 
{
    static void dataTypes(int a, float b, double c, long l, byte d)
    {

        double p = c / b; // step 1
        double q = b / a; // step 2
        double r = c / a; // step 3
        double m = r + l; // step 4
        int s = a / d;    // step 5

        System.out.println(p + " " + q + " " + r + " " + m + " " + s);
    }
}