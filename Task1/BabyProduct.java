package HomeWork.Task1;

/**
 * В классе BabyProduct добавлены новые поля - minAge, которое хранит минимальный возраст ребенка 
 * для использования товара, и hypoallergenic, которое хранит информацию о гипоаллергенности товара.
 */
public class BabyProduct extends BasicProduct {
    private int minAge;
    private boolean hypoallergenic;

    public BabyProduct(String name, float price, int quantity, String unit, int minAge, boolean hypoallergenic) {
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

    public boolean isHypoallergenic() {
        return hypoallergenic;
    }

    public void setHypoallergenic(boolean hypoallergenic) {
        this.hypoallergenic = hypoallergenic;
    }
} 
