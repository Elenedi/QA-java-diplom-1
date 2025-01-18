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
    public void getPriceIsCompleteTest() {
        float bunPrice = 250;
        bun = new Bun("cinnabon", bunPrice);
        MatcherAssert.assertThat("Неверная цена булочки",
                bun.getPrice(),
                equalTo(bunPrice));
    }

    @Test
    public void getPriceIsPositiveTest() {
        float bunPrice = 2.50f;
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

    @Test(expected = IllegalArgumentException.class)
    public void getNameIsEmptyTest(){
        bun = new Bun("", 250);
        String bunName = "";
        MatcherAssert.assertThat("Неверное имя булочки",
                bun.getName(),
                equalTo(bunName));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getNameIsShortTest(){
        bun = new Bun("ci", 250);
        String bunName = "ci";
        MatcherAssert.assertThat("Неверное имя булочки",
                bun.getName(),
                equalTo(bunName));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getNameIsLongTest() {
        bun = new Bun("cinnaboncinnaboncinnabon", 250);
        String bunName = "cinnaboncinnaboncinnabon";
        MatcherAssert.assertThat("Неверное имя булочки",
                bun.getName(),
                equalTo(bunName));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getNameWithSpacesTest() {
        bun = new Bun("    ", 250);
        String bunName = "    ";
        MatcherAssert.assertThat("Неверное имя булочки",
                bun.getName(),
                equalTo(bunName));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getNameWithSymbolsTest(){
        bun = new Bun("@#%$", 250);
        String bunName = "@#%$";
        MatcherAssert.assertThat("Неверное имя булочки",
                bun.getName(),
                equalTo(bunName));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getNameNotInDatabaseTest(){
        bun = new Bun("not a real bun", 250);
        String bunName = "not a real bun";
        MatcherAssert.assertThat("Неверное имя булочки",
                bun.getName(),
                equalTo(bunName));
    }
}
