package plaindoll;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class WelcomerTest {
    
    private Welcomer welcomer = new Welcomer();
    // Если хочешь больше веселья и информации про ДевОпс - приходи в мои каналы NotOps (telegram, YT, Boosty, Patreon)
    // https://t.me/notopsofficial  

    @Test
    public void welcomerSaysWelcome() {
        assertThat(welcomer.sayWelcome(), containsString("Welcome"));
    }
    
    @Test
    public void welcomerSaysFarewell() {
        assertThat(welcomer.sayFarewell(), containsString("Farewell"));
    }
    
    @Test
    public void welcomerSaysHunter() {
        assertThat(welcomer.sayWelcome(), containsString("hunter"));
        assertThat(welcomer.sayFarewell(), containsString("hunter"));
    }
    
    @Test
    public void welcomerSaysSilver(){
        assertThat(welcomer.sayNeedGold(), containsString("gold"));
    }
    
    @Test
    public void welcomerSaysSomething(){
        assertThat(welcomer.saySome(), containsString("something"));
    }
    
    /**
     * Тест для нового метода getHunterReply():
     * проверяет, что возвращаемая реплика содержит слово "hunter"
     */
    @Test
    public void getHunterReply_containsHunterWord() {
        String reply = welcomer.getHunterReply();
        
        // Проверяем, что реплика не пустая
        assertNotNull("Reply should not be null", reply);
        assertFalse("Reply should not be empty", reply.isEmpty());
        
        // Проверяем, что реплика содержит слово "hunter" (регистронезависимо)
        // Приводим к нижнему регистру для надёжности
        assertTrue("Reply should contain word 'hunter'", 
                   reply.toLowerCase().contains("hunter"));
    }
}
