import java.io.*;
public class Fibonacci {
    public static void main(String []args) throws Exception {
        int range, a = 0, b = 1, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the how many terms: ");
        range = Integer.parseInt(br.readLine());
        for (int i = 0; i < range; i++) {
            System.out.println("" + a);
            c = a + b;
            a = b;
            b = c;
        }
    }

}
