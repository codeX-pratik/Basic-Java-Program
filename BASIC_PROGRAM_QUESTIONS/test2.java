import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int A[] = {1,2,3};
        int newA = 0;
        for (int i=0 ; i<A.length ; i++) {
            newA = (newA * 10) + A[i];
        }

        int s = newA + 1;
        int n = Integer.toString(s).length()-1;
        System.out.println(n);
        int newArray[] = new int[n+1];
        int i = n ;
        while (s != 0) {
            int r = s % 10;
            newArray[i--] = r;
            s /= 10;
        }
        

        System.out.println(Arrays.toString(newArray));
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = (rev * 10) + n % 10;
            n /= 10;
        }
        return rev;
    }
}
