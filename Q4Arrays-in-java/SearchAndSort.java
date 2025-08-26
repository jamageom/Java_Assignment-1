import java.util.Scanner;

public class SortAndSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) arr[i] = sc.nextInt();

        // Bubble Sort
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9 - i; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

        System.out.print("Sorted Array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        // Binary Search
        System.out.print("Enter number to search: ");
        int key = sc.nextInt();
        int low = 0, high = 9, mid;
        boolean found = false;

        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Found at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }

        if (!found) System.out.println("Not found.");
    }
}
