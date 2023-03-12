package HomeWork.Task3_review;

public class Main {

    public static void main(String[] args) {

        // Figure[] figures = new Figure[4];

        // figures[0] = new Triangle(3, 4, 3);
        // figures[1] = new Square(5);
        // figures[2] = new Rectangle(4, 6);
        // figures[3] = new Circle(3);

        // // Посчитать периметр у всех фигур
        // for (Figure figure : figures) {
        // System.out.println(String.format("Периметр: %.2f", figure.getPerimeter()));
        // }

        // // Посчитать площадь у всех фигур
        // for (Figure figure : figures) {
        // System.out.println(String.format("Площадь: %.2f", figure.getArea()));
        // }

        FigureCollection collection = new FigureCollection();

        collection.addFigure(new Triangle(3, 2, 3));
        collection.addFigure(new Square(5));
        collection.addFigure(new Rectangle(2, 3));
        collection.addFigure(new Circle(5));

        collection.printAllFigures();
        // Треугольник со сторонами: 3,00, 2,00, 3,00; Площадь: 2,83; Периметр: 8,00
        // Квадрат со стороной: 5,00; Площадь: 25,00; Периметр: 20,00
        // Прямоугольник с длиной 2,00 и шириной 3,00; Площадь: 6,00; Периметр: 10,00
        // Круг с радиусом: 5,00; Площадь: 78,54; Периметр: 31,42

    }

}
