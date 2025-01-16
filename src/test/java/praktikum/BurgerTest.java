package praktikum;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(MockitoJUnitRunner.class)

public class BurgerTest {
    @Mock
    private Bun bun;

    @Mock
    private Ingredient ingredientA;

    @Mock
    private Ingredient ingredientB;

    @Test
    public void setBunsIsCompleteTest() {
        Burger burger = new Burger();
        Mockito.when(bun.getName()).thenReturn("sandwich");
        burger.setBuns(bun);
        MatcherAssert.assertThat("Новая булочка не добавляется",
                bun.getName(),
                equalTo(burger.bun.getName()));
    }
}
