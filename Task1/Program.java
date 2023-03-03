package HomeWork.Task1;

public class Program {
        public static void main(String[] args) {

                BasicProduct productMilk = new Milk("Молоко", 55.5, 1, "литр",
                                "10 марта 2023", 3.5);
                System.out.println(productMilk); // Продукт: Молоко; Цена: 55,50; Количество: 1; Ед. измерения: литр;
                                                 // Срок годности: 10 марта 2023; Жирность: 3.5%;

                // Изменяем цену продукта "Молоко" и выводим новую информацию
                productMilk.setPrice(50.1);
                System.out.println(productMilk); // Продукт: Молоко; Цена: 50,10; Количество: 1; Ед. измерения: литр;
                                                 // Срок годности: 10 марта 2023; Жирность: 3.5%;

                BasicProduct limonade = new BasicProduct("Лимонад", 150, 2, "литр");
                System.out.println(limonade); // Продукт: Лимонад; Цена: 150,00; Количество: 2; Ед. измерения: литр;

                BasicProduct bread = new Bread("Хлеб", 25, 400, "грамм", "пшеница");
                System.out.println(bread); // Продукт: Хлеб; Цена: 25,00; Количество: 400; Ед. измерения: грамм; Тип
                                           // муки: пшеница;

                BasicProduct eggs = new Eggs("Яйца", 100, 1, "упаковка", 10);
                System.out.println(eggs); // Продукт: Яйца; Цена: 100,00; Количество: 1; Ед. измерения: упаковка; шт. в
                                          // уп.: 10;

                BasicProduct masks = new BabyProduct("Маска", 334, 1, "шт",
                                3, "низкая");
                System.out.println(masks); // Продукт: Маска; Цена: 334,00; Количество: 1; Ед. измерения: шт; От 3 лет;
                                           // Гипоаллергенность: низкая;

                BasicProduct toiletPaper = new ToiletPaper("Туалетная бумага", 220, 1,
                                "упаковка", 15, 4);
                System.out.println(toiletPaper); // Продукт: Туалетная бумага; Цена: 220,00; Количество: 1; Ед.
                                                 // измерения: упаковка; Кол-во шт. в уп.: 15; Кол-во слоёв: 4;

                BasicProduct diapers = new Diapers("Подгузники", 2000, 1, "уп.",
                                8, "12-14", 1, 3, "#3");
                System.out.println(diapers); // Продукт: Подгузники; Цена: 2000,00; Количество: 1; Ед. измерения: уп.;
                                             // Кол-во шт. в уп.: 8; Размер: 12-14; От 1 до 3 лет; Тип: #3

                BasicProduct pacifier = new BabyProduct("Соска", 33, 1, "шт",
                                0, "низкая");
                System.out.println(pacifier); // Продукт: Соска; Цена: 33,00; Количество: 1; Ед. измерения: шт; От 0
                                              // лет; Гипоаллергенность: низкая;

        }
}
