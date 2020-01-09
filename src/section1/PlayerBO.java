package section1;

import java.util.List;

public class PlayerBO {
    void displayAllPlayerDetails(List<Player> list) {
        System.out.println("Player Details");
        for (Player player : list) {
            System.out.println(player);
        }
    }

}
