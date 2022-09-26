//factorial of a given number
import java.io.*;
public class Factorial {
    public static void main(String[] args) throws Exception {
        int num,fact=1;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the factorial: ");
        num=Integer.parseInt(br.readLine());
        for(int i=1; i<=num; i++){
            fact=fact*i;
        }
        System.out.println("The factorial is: "+fact);
    }
}
