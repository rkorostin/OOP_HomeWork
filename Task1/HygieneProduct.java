package HomeWork.Task1;

/**
 * В классе HygieneProduct добавлено новое поле - packQuantity, которое хранит количество штук в упаковке.
 */
public class HygieneProduct extends BasicProduct {
    private int packQuantity;
    /**
     * Конструктор HygieneProduct включает поля:
     * @param name - Название продукта
     * @param price - Цена
     * @param quantity - Количество
     * @param unit - ед. измерения
     * @param packQuantity кол-во шт. в упаковке
     */
    public HygieneProduct(String name, double price, int quantity, String unit, int packQuantity) {
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
        return String.format("%s Кол-во шт. в уп.: %d;", super.toString(), this.packQuantity);
    }
}
