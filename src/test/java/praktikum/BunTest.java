package praktikum;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;

public class BunTest {

    private Bun bun;

    @Test
    public void getNameIsCompleteTest() {
        bun = new Bun("cinnabon", 250);
        String bunName = "cinnabon";
        MatcherAssert.assertThat("Неверное имя булочки", 
                bun.getName(), 
                equalTo(bunName));
    }

    @Test
    public void getPriceIsPositiveDoubleTest() {
        double bunPrice = 2.50;
        bun = new Bun("cinnabon", bunPrice);
        MatcherAssert.assertThat("Неверная цена булочки",
        bun.getPrice(),
        equalTo(bunPrice));
    }

    @Test
    public void getPriceIsZeroTest() {
        float bunPrice = 0;
        bun = new Bun("cinnabon", bunPrice);
        MatcherAssert.assertThat("Неверная цена булочки",
                bun.getPrice(),
                equalTo(bunPrice));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getPriceIsNegativeTest() {
        float bunPrice = -100;
        bun = new Bun("cinnabon", bunPrice);
        MatcherAssert.assertThat("Неверная цена булочки",
                bun.getPrice(),
                equalTo(bunPrice));
    }
    @Test
    public void getPriceIsCompleteTest() {
        float bunPrice = 250;
        Bun bun = new Bun("cinnabon", bunPrice);
        MatcherAssert.assertThat("Неверная цена булочки", 
                bun.getPrice(),
                equalTo(bunPrice));
    }
}
