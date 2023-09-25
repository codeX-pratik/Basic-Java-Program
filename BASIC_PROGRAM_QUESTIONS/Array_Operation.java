import java.util.*;

public class Array_Operation {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the size of the Array : ");
        int size = sc.nextInt();
        int A[] = new int[size];
        for (int i=0 ; i<size ; i++) {
            System.out.print("Enter element : ");
            A[i] = sc.nextInt();
        }
        while (true) {
            System.out.println("0. Exit");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Reverse");
            System.out.println("4. Display");
            System.out.print("Enter your Choice : ");
            switch(sc.nextInt()) {
                case 0 : System.out.println("Exiting..."); System.exit(0); break;
                case 1 : A = insertElementToArray(A); break;
                case 2 : A = deleteElementFromArray(A); break;
                case 3 : A = reversingArray(A); break;
                case 4 : display(A); break;
                default : System.out.println("Invalid Choice"); break;
            }
        }
    }

    public static int[] deleteElementFromArray(int A[]) {
        int newA[] = new int[A.length-1];
        System.out.print("Enter the element you want to remove : ");
        int e = sc.nextInt();

        for (int i=0 , j=0 ; i<newA.length ; i++ , j++) {
            if (A[i] == e) {
                j++;
                newA[i] = A[j];
            } else {
                newA[i] = A[j];
            }
        }
        return newA;
    }

    public static int[] insertElementToArray(int A[]) {
        int newA[] = new int[A.length+1];
        System.out.print("Enter the element you want to insert : ");
        int e = sc.nextInt();
        System.out.print("Enter the position , the element would be inserted : ");
        int p = sc.nextInt();

        for (int i=0 , j=0 ; i<newA.length ; i++ , j++) {
            if (i == p) {
                newA[i] = e;
                j--;
            } else {
                newA[i] = A[j];
            }
        }
        return newA;
    }

    public static int[] reversingArray(int A[]) {
        int newA[] = new int[A.length];
        for (int i=0 , j=A.length-1 ; i<A.length ; i++ , j--) {
            newA[i] = A[j];
        }
        return newA;
    }

    public static void display(int A[]) {
        System.out.println(Arrays.toString(A));
    }
}
