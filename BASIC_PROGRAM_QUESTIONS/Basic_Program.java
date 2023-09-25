import java.util.*;

public class Basic_Program {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        while (true) {
            System.out.println("0. Exit");
            System.out.println("1. Leap year");
            System.out.println("2. Factorial");
            System.out.println("3. Prime Number");
            System.out.println("4. GCD");
            System.out.println("5. Reversing a Integer");
            System.out.println("6. Integer palindrome");
            System.out.println("7. Reversing a String");
            System.out.println("8. String palindrome");

            System.out.print("Enter your choice : ");
            switch(sc.nextInt()) {
                case 0 : 
                    System.out.println("Exiting..."); 
                    System.exit(0); break;
                case 1 : 
                    System.out.print("Enter the year : "); 
                    leapYear(sc.nextInt()); break;
                case 2 : 
                    System.out.print("Enter a  Number : ");
                    System.out.println(factorial(sc.nextInt())); break;
                case 3 : 
                    System.out.print("Enter a Number : ");
                    primeNumber(sc.nextInt()); break;
                case 4 : 
                    System.out.print("Enter a 2 Number : ");
                    System.out.println(GCD(sc.nextInt(), sc.nextInt())); break;
                case 5 : 
                    System.out.print("Enter a Number : ");
                    System.out.println(reverseInteger(sc.nextInt())); break;
                case 6 : 
                    System.out.print("Enter a Number : ");
                    integerReserveCheck(sc.nextInt()); break;
                case 7 : 
                    System.out.print("Enter the String : ");
                    System.out.println(reverseString(sc.next())); break;
                case 8 : 
                    System.out.print("Enter the String : ");
                    stringReverseCheck(sc.next()); break;
                default : System.out.println("Invalid Choice"); break;
            }

        }
    }

    public static void leapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("This is a leap year.");
        } else {
            System.out.println("This is not a leap year.");
        }
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i=1 ; i<=n ; i++) {
            f = f * i;
        }
        return f;
    }

    public static void primeNumber(int n) {
        int t = 0;
        for (int i=2 ; i<n/2 ; i++) {
            if (n % i == 2) {
                t++;
            }
        }
        if (t == 0) {
            System.out.println("The is Prime Number");
        } else {
            System.out.println("This is not Prime Number");
        }
    }

    public static int GCD(int n1 , int n2) {
        int gcd = 0;
        for (int i=1 ; i<Math.min(n1, n2) ; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int reverseInteger(int n) {
        int rev = 0;
        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n = n / 10;
        }
        return rev;
    }

    public static void integerReserveCheck(int n) { 
        if (n == reverseInteger(n)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static String reverseString(String s) {
        int n = s.length();
        String str = "";
        while (n-->0) {
            str = str + s.charAt(n);
        }
        return str;
    }

    public static void stringReverseCheck(String s) {
        if (s.equals(reverseString(s))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
