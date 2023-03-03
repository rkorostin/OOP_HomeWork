package HomeWork.Task1;

/**
 * Класс Milk наследуется от класса FoodProduct,
 * который в свою очередь наследуется от родительского класса BasicProduct
 * Добавлено новое поле fatPercentage, которое содержит в себе процент жирности
 */
public class Milk extends FoodProduct {
    private double fatPercentage;

    /**
     * Конструктор Milk с полями:
     * 
     * @param name           - Название продукта
     * @param price          - Цена
     * @param quantity       - Количество
     * @param unit           - Ед. измерения
     * @param expirationDate - Срок годности
     * @param fatPercentage  - % жирности
     */
    public Milk(String name, double price, int quantity, String unit,
            String expirationDate, double fatPercentage) {
        super(name, price, quantity, unit, expirationDate);
        this.fatPercentage = fatPercentage;
    }

    public double getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(double fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    // Вывод информации о товаре (перегрузка метода toString класса Object)
    public String toString() {
        return String.format("%s; Жирность: %s%%;", super.toString(), this.fatPercentage);
    }

}
