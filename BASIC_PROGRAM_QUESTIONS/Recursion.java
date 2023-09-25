public class Recursion {
    public static void main(String[] args) {
        String s = "axbcxxd";
        moveAElementToLast(s, 'x', 0, 0, "");
    }

    public static void towerOfHanoi(int n , String source , String helper , String desti) {
        if (n == 1) {
            System.out.println("Disk " + n + " transfered from " + source + " to " + desti); 
            return;   
        }
        towerOfHanoi(n-1, source, desti, helper);
        System.out.println("Disk " + n + " transfered from " + source + " to " + desti);
        towerOfHanoi(n-1, helper, source, desti);
    }

    public static void reverseStringUsingRecursion(String s , int index) {
        if (index == 0) {
            System.out.println(s.charAt(index));
            return;    
        }
        System.out.print(s.charAt(index));
        reverseStringUsingRecursion(s, index-1);
    }

    public static int first = -1;
    public static int last = -1;
    public static void findOccurence(String s , int idx , char element) {
        if (idx == s.length()) {
            System.out.println(first + " " + last);
            return;
        }
        char c = s.charAt(idx);
        if (c == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccurence(s, idx+1, element);
    }

    public static boolean isSorted(int arr[] , int idx) {
        if (idx == arr.length-1) {
            return true;
        }
        if (arr[idx] >= arr[idx+1]) {
            return false;
        }
        return isSorted(arr, idx+1);
    }

    public static void moveAElementToLast(String s , char a , int idx , int count , String newString) {
        if (idx == s.length()-1) {
            for (int i=0 ; i<count ; i++) {
                newString += a;
            }
            System.out.println(newString);
            return;
        }
        if (a == s.charAt(idx)) {
            count++;
        } else {
            newString += s.charAt(idx);
        }
        moveAElementToLast(s, a, idx+1, count, newString);
    }
}
