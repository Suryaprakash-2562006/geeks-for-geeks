import java.util.Scanner;

class Geeks {
    static void getInput() {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of testcases
        
        while (t-- > 0) {
            int a = sc.nextInt();
            sc.nextLine();        // clear the leftover newline
            String s = sc.nextLine();

            System.out.println(a);
            System.out.println(s);
        }
    }
}