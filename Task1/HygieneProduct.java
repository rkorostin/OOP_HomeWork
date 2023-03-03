package HomeWork.Task1;

/**
 * В классе HygieneProduct добавлено новое поле - packQuantity, которое хранит количество штук в упаковке.
 */
public class HygieneProduct extends BasicProduct {
    private int packQuantity;

    public HygieneProduct(String name, float price, int quantity, String unit, int packQuantity) {
        super(name, price, quantity, unit);
        this.packQuantity = packQuantity;
    }

    public int getPackQuantity() {
        return packQuantity;
    }

    public void setPackQuantity(int packQuantity) {
        this.packQuantity = packQuantity;
    }
}
