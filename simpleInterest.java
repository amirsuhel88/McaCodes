import java.io.*;

public class simpleInterest {
    public static void main(String[] args) throws Exception{
        int p,r,t,si,total;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter how much money you want to Invest: ");
        p=Integer.parseInt(br.readLine());
        System.out.println("Enter rate of Interest: ");
        r=Integer.parseInt(br.readLine());
        System.out.println("Enter how long you want to invest:  ");
        t=Integer.parseInt(br.readLine());
        si= (p*r*t)/100;
        System.out.println("Total interest is: "+si);
        total = p+si;
        System.out.println("Total money with Interest is: "+total);
    }
}
