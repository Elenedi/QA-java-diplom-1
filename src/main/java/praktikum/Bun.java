package praktikum;

/**
 * Модель булочки для бургера.
 * Булочке можно дать название и назначить цену.
 */
public class Bun {

    public String name;
    public float price;

    public Bun(String name, float price) {
        if (price < 0) {
            throw new IllegalArgumentException("Цена не может быть отрицательной");
            }
        this.name = name;
        this.price = price;
    }

    public Bun(String cinnabon, double bunPrice) {
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

}