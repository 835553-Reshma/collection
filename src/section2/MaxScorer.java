package section2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxScorer {

    public static void main(String[] args) {
        HashMap<String, Long> player = new HashMap<String, Long>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players  ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.println("Enter the details of player  " + i);
            String playerName = sc.nextLine();
            long runs = sc.nextLong();
            player.put(playerName, runs);
        }
        ArrayList<String> key = new ArrayList<String>();
        ArrayList<Long> value = new ArrayList<Long>();
        LinkedHashMap<String, Long> findPlayer = new LinkedHashMap<String, Long>(player);
        findPlayer.putAll(player);
        for (Map.Entry<String, Long> me : findPlayer.entrySet()) {
            key.add(me.getKey());
            value.add(me.getValue());
        }
        long max = Collections.max(value);
        int index = -1;
        for (int i = 0; i < key.size(); i++) {
            if (max == value.get(i)) {
                index = i;
                break;
            }
        }
        System.out.println(key.get(index));
        sc.close();

    }

}
