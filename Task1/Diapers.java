package HomeWork.Task1;
/**
 * Класс Diapers наследуется от HygieneProduct, который унаследован от BasicProduct
 * Добавлены новые поля:
 * size - размер подгузника
 * minWeight - минимальный вес ребёнка
 * maxWeight - максимальный вес ребёнка
 * type - тип подгузника
 */
public class Diapers extends HygieneProduct {
    private String size;
    private int minWeight;
    private int maxWeight;
    private String type;
    /**
     * Конструктор Diapers сорержит поля:
     * @param name - Название продукта
     * @param price - Цена
     * @param quantity - Количество
     * @param unit - Ед. измерения
     * @param size - Размер
     * @param minWeight - Возраст ОТ
     * @param maxWeight - Возраст ДО
     * @param type - Тип
     */
    public Diapers(String name, double price, int quantity, String unit, int packQuantity, String size,
            int minWeight, int maxWeight, String type) {
        super(name, price, quantity, unit, packQuantity);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public int getMinWeight() {
        return minWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public String getType() {
        return type;
    }

    // Вывод информации о товаре (перегрузка метода toString класса Object)
    public String toString() {
        return String.format("%s Размер: %s; От %d до %d лет; Тип: %s",
                super.toString(), this.size, this.minWeight, this.maxWeight, this.type);
    }
}
