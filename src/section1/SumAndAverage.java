package section1;

import java.util.ArrayList;
import java.util.Scanner;

public class SumAndAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Sample Input:");
        int n = sc.nextInt();
        float average = 0.0f;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            list.add(input);
        }
        for (Integer integer : list) {
            sum = sum + integer;
        }
        average = (float) sum / n;
        System.out.println("Sample Output:");
        System.out.println(sum);
        System.out.printf("%.2f", average);

        sc.close();

    }

}
