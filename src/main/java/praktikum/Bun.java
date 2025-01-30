package praktikum;

/**
 * Модель булочки для бургера.
 * Булочке можно дать название и назначить цену.
 */
public class Bun {

    public String name;
    public float price;

    public Bun(String name, float price) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя булочки не может быть пустым");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("Имя булочки слишком короткое");
        }
        if (name.length() > 27) {
            throw new IllegalArgumentException("Имя булочки слишком длинное");
        }
        if (name.matches(".*[^a-zA-Z0-9 ].*")) { // Проверка на специальные символы
            throw new IllegalArgumentException("Имя булочки не может содержать специальные символы");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Цена булочки не может быть отрицательной");
        }
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

}