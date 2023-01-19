import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr;
        boolean flag = true;

        while (flag) {
            System.out.println("1. Enter integers to sort");
            System.out.println("2. Display sorted integers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of integers to sort: ");
                    int size = input.nextInt();
                    arr = new int[size];
                    System.out.print("Enter the integers: ");
                    for (int i = 0; i < size; i++) {
                        arr[i] = input.nextInt();
                    }
                    bubbleSort(arr);
                    break;
                case 2:
                
                    if (arr == null) {
                        System.out.println("No integers to display. Please enter integers first.");
                    } else {
                        System.out.print("Sorted integers: ");
                        for (int i : arr) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
        input.close();
    }

    public static void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
