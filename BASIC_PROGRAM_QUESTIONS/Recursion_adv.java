import java.util.*;

public class Recursion_adv {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
    }

    public static void printPermutation(String str , String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
 
        for (int i=0 ; i<str.length() ; i++) {
            char currChar = str.charAt(i);
            String s1 = str.substring(0 , i);
            String s2 = str.substring(i + 1);
            //String newstr = str.substring(0 , i) + str.substring(i + 1);
            String newstr = s1 + s2;
            printPermutation(newstr , permutation + currChar);
        }
    }

    public static int countPaths(int i , int j , int n , int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n-1 && j == m - 1) {
            return 1;
        }
        int downPath = countPaths(i+1, j, n, m);
        int rightPath = countPaths(i, j+1, n, m);

        return downPath + rightPath;
    }

    public static int placeTile(int n , int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        int verticalPlacement = placeTile(n-1, m);
        int horizontalPlacement = placeTile(n-1, m);

        return verticalPlacement + horizontalPlacement;
    }

    public static int callGuest(int n) {
        if (n <= 1) {
            return 1;
        }
        int way1 = callGuest(n-1);
        int way2 = (n-1) * callGuest(n-2);

        return way1 + way2;
    }
}
