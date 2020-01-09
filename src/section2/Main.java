package section2;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double length = 0;
        double width = 0;
        double height = 0;
        Scanner sc = new Scanner(System.in);
        HashSet<Box> set = new HashSet<Box>();
        System.out.println("Enter the number of Box");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the Box" + i + "details");
            System.out.println("Enter Length");
            length = sc.nextDouble();
            System.out.println("Enter Width");
            width = sc.nextDouble();
            System.out.println("Enter Height");
            height = sc.nextDouble();
            Box box = new Box(length, width, height);
            box.setVolume(length, width, height);
            set.add(box);
        }
        System.out.println("Unique boxes in the sets are");
        for (Box box1 : set) {
            System.out.println(box1.toString());
        }
        sc.close();

    }

}
