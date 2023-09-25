import java.util.*;

public class Sorting_Technique {
    
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the size of the Array : ");
        int A[] = new int[sc.nextInt()];
        for (int i=0 ; i<A.length ; i++) {
            System.out.print("Enter element : ");
            A[i] = sc.nextInt();
        }

        while (true) {
            System.out.println("0. Exit");
            System.out.println("1. Bubble Sorting");
            System.out.println("2. Selection Sorting");
            System.out.println("3. Insertion Sorting");
            System.out.print("Enter the Choice : ");
            switch(sc.nextInt()) {
                case 0 : System.out.println("Exiting..."); System.exit(0); break;
                case 1 : bubbleSorting(A); break;
                case 2 : selectionSorting(A); break;
                case 3 : insertionSortin(A); break;
                default : System.out.println("Invalid choice");
            }
        }
    }

    //Bubble Sorting 
    public static void bubbleSorting(int Array[]) {
        int n = Array.length;
        for (int i=0 ; i<n-1 ; i++) {
            for (int j=0 ; j<n-i-1 ; j++) {
                if (Array[j] > Array[j+1]) {
                    int temp = Array[j];
                    Array[j] = Array[j+1];
                    Array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(Array));
    }

    //Selection Sorting 
    public static void selectionSorting(int Array[]) {
        int n = Array.length;
        for (int i=0 ; i<n-1 ; i++) {
            int min = i;
            for (int j=i+1 ; j<n ; j++) {
                if (Array[min] > Array[j]) {
                    min = j;
                }
            }
            int temp = Array[min];
            Array[min] = Array[i];
            Array[i] = temp;
        }
        System.out.println(Arrays.toString(Array));
    }

    //Insertion Sorting
    public static void insertionSortin(int Array[]) {
        int n = Array.length;
        for (int i=1 ; i<n ; i++) {
            int current = Array[i];
            int j = i - 1;
            while (j >= 0 && current < Array[j]) {
                Array[j+1] = Array[j];
                j--;
            }
            Array[j+1] = current;
        }
        System.out.println(Arrays.toString(Array));
    }
}