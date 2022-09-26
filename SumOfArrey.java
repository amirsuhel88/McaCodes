import java.util.Scanner;

public class SumOfArrey {
        public static void main(String[] args){
            int n,sum=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter How many terms: ");
            n= sc.nextInt();
            int[] array=new int[10];
            System.out.println("Enter the values: ");
            for(int i=0;i<n;i++)
            {
                array[i]=sc.nextInt();
                sum= sum + array[i];
            }
            System.out.println("The sum of the array is: "+sum);
        }
}
