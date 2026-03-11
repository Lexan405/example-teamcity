package plaindoll;

import java.util.Random;

public class Welcomer {
    
    // Если хочешь больше веселья и информации про ДевОпс - приходи в мои каналы NotOps (telegram, YT, Boosty, Patreon)
    // https://t.me/notopsofficial  
    
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
    
    /**
     * Возвращает произвольную реплику, содержащую слово "hunter"
     */
    public String getHunterReply() {
        String[] replies = {
            "Hello, hunter! Ready for the next quest?",
            "The path is clear, hunter. Proceed with caution.",
            "Hunter, your reputation precedes you.",
            "Welcome back, hunter. The fire is lit.",
            "Hunter, the night is dark and full of terrors."
        };
        
        Random random = new Random();
        return replies[random.nextInt(replies.length)];
    }
}
