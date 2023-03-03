package HomeWork.Task1;

public class Program {
    public static void main(String[] args) {

        BasicProduct productMilk = new Milk("Молоко", 55.5, 1, "литр",
                "10 марта 2023", 3.5);
        // Вывод информации о продукте "Молоко"
        System.out.println(productMilk);
        // Изменяем цену продукта "Молоко" и выводим новую информацию
        productMilk.setPrice(50.1);
        System.out.println(productMilk);

        BasicProduct limonade = new BasicProduct("Лимонад", 150, 2, "литр");
        System.out.println(limonade);

        BasicProduct bread = new Bread("Хлеб", 25, 400, "грамм", "пшеница");
        System.out.println(bread);

        BasicProduct eggs = new Eggs("Яйца", 100, 1, "упаковка", 10);
        System.out.println(eggs);

        BasicProduct masks = new BabyProduct("Маска", 334, 1, "шт",
                3, "низкая");
        System.out.println(masks);

        BasicProduct toiletPaper = new ToiletPaper("Туалетная бумага", 220, 1,
                "упаковка", 15, 4);
        System.out.println(toiletPaper);

        BasicProduct diapers = new Diapers("Подгузники", 2000, 1, "уп.",
                8, "12-14", 1, 3, "#3");
        System.out.println(diapers);

        BasicProduct pacifier = new BabyProduct("Соска", 33, 1, "шт",
                0, "низкая");
        System.out.println(pacifier);

    }
}
