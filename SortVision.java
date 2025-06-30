import java.util.*;

public class SortVision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Sort Vision");
        System.out.println("Choose an algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.print("Enter choice (1/2/3): ");
        int choice = sc.nextInt();

        System.out.print("\nEnter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long startTime = System.nanoTime();

        switch (choice) {
            case 1:
                bubbleSort(arr);
                break;
            case 2:
                selectionSort(arr);
                break;
            case 3:
                insertionSort(arr);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1e6;

        System.out.println("\n Sorted Array: " + Arrays.toString(arr));
        System.out.println("⏱️ Time taken: " + duration + " ms");
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        System.out.println("\n Bubble Sort Steps:");
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        System.out.println("\n Selection Sort Steps:");
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;

            System.out.println(Arrays.toString(arr));
        }
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        System.out.println("\n Insertion Sort Steps:");
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                System.out.println(Arrays.toString(arr));
            }
            arr[j + 1] = key;
            System.out.println(Arrays.toString(arr));
        }
    }
}
