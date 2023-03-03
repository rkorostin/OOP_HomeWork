package HomeWork.Task1;

/**
 * Класс BabyProduct наследован от BasicProduct
 * Добавлены новые поля - minAge, которое хранит минимальный возраст ребенка для использования товара
 * hypoallergenic, которое хранит информацию о гипоаллергенности товара.
 */
public class BabyProduct extends BasicProduct {
    private int minAge;
    private String hypoallergenic;
    /**
     * Конструктор BabyProduct содержит поля:
     * @param name - Название продукта  
     * @param price - Цена
     * @param quantity - Количество
     * @param unit - ед. измерения
     * @param minAge - минимальный возраст
     * @param hypoallergenic - гироаллергенность товара
     */
    public BabyProduct(String name, float price, int quantity, String unit,
     int minAge, String hypoallergenic) {
        super(name, price, quantity, unit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public String getHypoallergenic() {
        return hypoallergenic;
    }

    public void setHypoallergenic(String hypoallergenic) {
        this.hypoallergenic = hypoallergenic;
    }

    // Вывод информации о товаре (перегрузка метода toString класса Object)
    public String toString() {
        return String.format("%s От %d лет; Гипоаллергенность: %s;",
         super.toString(), this.minAge, this.hypoallergenic);
    }

} 
