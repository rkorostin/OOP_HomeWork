package HomeWork.Task1;

/**
 * Класс ToiletPaper наследован от Eggs, который в свою очередь наследован от
 * BasicProduct
 * Добавлено поле layers - количество слоёв в рулоне
 */
public class ToiletPaper extends HygieneProduct {
    private int layers;

    /**
     * Конструктор ToiletPaper содержит поля:
     * 
     * @param name         - Название продукта
     * @param price        - Цена
     * @param quantity     - Количество
     * @param unit         - Ед. измерения
     * @param packQuantity - Количество шт. в упаковке
     * @param layers       - Количетсво слоёв в рулоне
     */
    public ToiletPaper(String name, double price, int quantity, String unit, int packQuantity, int layers) {
        super(name, price, quantity, unit, packQuantity);
        this.layers = layers;
    }

    public int getLayers() {
        return layers;
    }

    public void setLayers(int layers) {
        this.layers = layers;
    }

    // Вывод информации о товаре (перегрузка метода toString класса Object)
    public String toString() {
        return String.format("%s Кол-во слоёв: %d;", super.toString(), this.layers);
    }
}
