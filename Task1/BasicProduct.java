package HomeWork.Task1;
/**
 * Родительский класс
 */
public class BasicProduct {

    private String name;
    private double price;
    private int quantity;
    private String unit;
    /**
     * Конструктор BasicProduct
     * @param name название продукта
     * @param price цена 
     * @param quantity количество
     * @param unit единица измерения
     */
    public BasicProduct(String name, double price, int quantity, String unit) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(double price) {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity(int quantity) {
        return quantity;
    }

    public String getunit(String unit) {
        return unit;
    }

    public void setunit(String unit) {
        this.unit = unit;
    }
    
    @Override
    public String toString() {
        return String.format("Продукт: %s; Цена: %.2f; Количество: %d; Ед. измерения: %s;",
        this.name, this.price, this.quantity, this.unit);
    }
}
