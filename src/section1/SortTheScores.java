package section1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class SortTheScores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Sample Input:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            list.add(input);
        }
        System.out.println("Sample Output:");
        Collections.sort(list);
        ListIterator<Integer> li = list.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }
        sc.close();
    }

}
