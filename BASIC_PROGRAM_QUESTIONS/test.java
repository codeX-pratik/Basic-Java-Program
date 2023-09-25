import java.util.*;

public class test {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int n = 123;
        
        while (n > 0) {
            int r = n % 10;
            System.out.println(r);
            n = n /10;
        }
        

    }
}
