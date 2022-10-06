import java.util.Scanner;

public class Bubble {
    public static void main(String[] args){
        int temp,rem,count,n;
        int[] num_list= new int[8];   
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements in the list: ");
        n = sc.nextInt();
        System.out.println("Enter elements of the list: ");
        for(int i = 0; i<n; i++){
            num_list[i] = sc.nextInt();
        }

         for (int i = 0; i < n; i++) {
            for (int j =0; j < n - 1; j++) {
                 //rem = num_list[i] % 2;
                //if (rem == 0) {
                    if(num_list[j]> num_list[j+1]){
                        temp = num_list[j];
                        num_list[j] = num_list[j + 1];
                        num_list[j + 1] = temp;
                    }
                     
                }
             }
        
        System.out.println("Sorted list is: ");
        for(int i=0; i<n; i++){
            System.out.println(num_list[i]);
        }
    }

}
