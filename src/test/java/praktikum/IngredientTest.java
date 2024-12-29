package praktikum;

import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;

public class IngredientTest {
    private Ingredient ingredient;
    private IngredientType ingredientType = IngredientType.FILLING;
    private String ingredientName = "Milk";
    private float ingredientPrice = 111;

    @Before
    public void createIngredient() {
        this.ingredient = new Ingredient(ingredientType,ingredientName,ingredientPrice); }

@Test
  public void getPriceIsComplete() {
    MatcherAssert.assertThat("Неверная цена ингредиента",
            ingredient.getPrice(),
            equalTo(ingredientPrice));
}

@Test
    public void getNameIsComplete() {
        MatcherAssert.assertThat("Неверное название ингредиента",
                ingredient.getName(),
                equalTo(ingredientName));
}

@Test
    public void getTypeIsComplete() {
    MatcherAssert.assertThat("Неверный тип ингредиента",
            ingredient.getType(),
            equalTo(ingredientType));
}
}
