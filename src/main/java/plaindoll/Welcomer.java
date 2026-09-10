package plaindoll;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Welcomer {

    public String sayWelcome() {
        return "Welcome home, good hunter. What is it your desire?";
    }

    public String sayFarewell() {
        return "Farewell, good hunter. May you find your worth in waking world.";
    }

    public String sayNeedGold() {
        return "Not enough gold";
    }

    public String saySome() {
        return "something in the way";
    }

    public String sayFeniks() {
        return "This hunter is name is Petrovich!";
    }

    public String getHunterReply() {
        List<String> replies = List.of(
            "Hello, hunter!",
            "Good luck, hunter!",
            "Welcome back, hunter!"
        );

        return replies.get(
            ThreadLocalRandom.current().nextInt(replies.size())
        );
    }
}