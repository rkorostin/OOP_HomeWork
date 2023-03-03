package HomeWork.Task1;

public class Program {
    public static void main(String[] args) {

        BasicProduct productMilk = new Milk("Milk2", 10.5, 3, "liter",
                "10 марта 2023", 3.5);
        // Вывод информации о продукте "Молоко"
        System.out.println(productMilk);
        // Изменяем цену продукта "Молоко" и выводим новую информацию
        productMilk.setPrice(10.1);
        System.out.println(productMilk);
    }
}
