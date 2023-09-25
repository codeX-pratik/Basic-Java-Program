import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

public class HASHSET {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        // Hashset does not allow duplicate element
        System.out.println("The size of the set : " + set.size());
        
        //Removing element from set
        set.remove(1);

        //Searching a element in set , we use "contains"
        if (set.contains(1)) {
            System.out.println("yes it has 1");
        } else {
            System.out.println("It does not have 1");
        }

        if (set.contains(5)) {
            System.out.println("Yes it has 5");
        } else {
            System.out.println("No it does not have 5");
        }

        System.out.println(set);

        // Iteration in HashSet
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}