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

    @Test
    public void addIngredientIsCompleteTest(){
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredientA);
        MatcherAssert.assertThat("Ингредиент не добавляется",
                burger.ingredients.size(),
                equalTo(1));
    }

    @Test
    public void removeIngredientIsCompleteTest(){
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredientA);
        burger.removeIngredient(0);
        MatcherAssert.assertThat("Ингредиент не удаляется",
                burger.ingredients.size(),
                equalTo(0));
    }

    @Test
    public void getPriceIsCompleteTest(){
        float bunPrice = 100;
        float ingredientPrice = 50;
        Mockito.when(bun.getPrice()).thenReturn(bunPrice);
        Mockito.when(ingredientA.getPrice()).thenReturn(ingredientPrice);
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredientA);

        MatcherAssert.assertThat("Неверная цена бургера",
                burger.getPrice(),
                equalTo(bunPrice * 2 + ingredientPrice));
    }

    @Test
    public void getReceiptIsCompleteTest(){
        Mockito.when(bun.getName()).thenReturn("sandwich");
        Mockito.when(ingredientA.getName()).thenReturn("cheese");
        Mockito.when(ingredientA.getType()).thenReturn(IngredientType.FILLING);
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredientA);

        String expectedReceipt = "(==== sandwich ====)\n= filling cheese =\n(==== sandwich ====)\n\nPrice: " + burger.getPrice() + "\n";
        MatcherAssert.assertThat("Неверный чек",
                burger.getReceipt(),
                equalTo(expectedReceipt));
    }

}
