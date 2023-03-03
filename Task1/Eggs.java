package HomeWork.Task1;
/**
 * Класс Eggs наследуется от BasicProduct
 * Добавлено новое поле packQuantity, которое содержит в количество штук в упаковке
 */
public class Eggs extends BasicProduct {
    private int packQuantity;
    /**
     * Конструктор Eggs содержит поля:
     * @param name - Название продукта
     * @param price - Цена
     * @param quantity - Количество
     * @param unit - ед. измерения
     * @param packQuantity - количество шт. в упаковке
     */
    public Eggs(String name, double price, int quantity, String unit, int packQuantity) {
        super(name, price, quantity, unit);
        this.packQuantity = packQuantity;
    }

    public int getPackQuantity() {
        return packQuantity;
    }

    public void setPackQuantity(int packQuantity) {
        this.packQuantity = packQuantity;
    }

    // Вывод информации о товаре (перегрузка метода toString класса Object)
    public String toString() {
        return String.format("%s шт. в уп.: %d;", super.toString(), this.packQuantity);
    }
}
