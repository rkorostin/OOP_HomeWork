package HomeWork.Task1;

/**
 * В классе DrinkProduct добавлено новое поле - volume, которое хранит объём напитка.
 */
public class DrinkProduct extends BasicProduct {
    private int volume;

    public DrinkProduct(String name, float price, int quantity, String unit, int volume) {
        super(name, price, quantity, unit);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
} 