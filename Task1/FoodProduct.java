package HomeWork.Task1;

/**
 * Класс FoodProduct наследуется от BasicProduct. 
 * Добавлено поле expirationDate, которое хранит срок годности продукта.
 */
public class FoodProduct extends BasicProduct {
    private String expirationDate;
    /**
     * Конструктор FoodProduct
     * @param name имя продукта
     * @param price цена
     * @param quantity количество
     * @param unit единица измерения
     * @param expirationDate срок годности
     */
    public FoodProduct(String name, double price, int quantity, String unit, String expirationDate) {
        super(name, price, quantity, unit);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String toString() {
        return String.format("%s Срок годности: %s", super.toString(), this.expirationDate);
    }
}
