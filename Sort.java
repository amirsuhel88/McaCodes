import java.util.Scanner;

class InOut {

    Scanner sc = new Scanner(System.in);
    int num_list[] = new int[8];
    int n, rem, temp, count = 0;

    void setData() {

        System.out.println("Enter how many numbers to the entered");
        n = sc.nextInt();
        System.out.println("Enter the numbers in list: ");
        for (int i = 0; i < n; i++) {
            num_list[i] = sc.nextInt();
        }
    }

    void getData() {

        System.out.println("Your entered list is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(num_list[i]);
        }
    }

    void sorted() {
        for (int i = 0; i < n; i++) {
            rem = num_list[i] % 2;
            if (rem == 0) {
                for (i = 0; i < n; i++) {
                    count++;
                    for (int j = 0; j < n - 1; j++) {

                        if (num_list[j] > num_list[j + 1]) {
                            temp = num_list[j];
                            num_list[j] = num_list[j + 1];
                            num_list[j + 1] = temp;
                          
                        }

                    }
                }
            } 
           

           
            } 
        for(int i= count; i<n; i++){
            rem = num_list[i] % 2;
            if(rem != 0){
                for ( i = count; i < n; i++) {
                    for (int j = count; j < n - 1; j++) {
                        int rem1 = num_list[i] % 2;
                        if (rem1 != 0) {
                            temp = num_list[j];
                            num_list[j] = num_list[j + 1];
                            num_list[j + 1] = temp;
                        }
                    }
                }
            }
        }
        System.out.println("Sorted list is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(num_list[i]);
    }
}

public class Sort {
    public static void main(String[] args) {
        InOut io = new InOut();
        io.setData();
        io.getData();
        io.sorted();
    }
}