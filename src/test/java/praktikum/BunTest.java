package praktikum;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;

public class BunTest {

    private Bun bun;

    @Test
    public void getNameIsComplete() {
        String bunName = "cinnabon";
        MatcherAssert.assertThat("Неверное имя булочки", 
                bun.getName(), 
                equalTo(bunName));
    }
    
    @Test
    public void getPriceIsComplete() {
        float bunPrice = 250;
        Bun bun = new Bun("cinnabon", bunPrice);
        MatcherAssert.assertThat("Неверная цена булочки", 
                bun.getPrice(),
                equalTo(bunPrice));
    }
}
