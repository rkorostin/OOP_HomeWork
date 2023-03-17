package HomeWork.Task4;

public class Main {
    public static void main(String[] args) {

        DynamicArray<Integer> dynamicArray = new DynamicArray<>();

        // добавляем элементы
        dynamicArray.add(5);
        dynamicArray.add(7);
        dynamicArray.add(3);
        dynamicArray.add(-3);

        // выводим элементы массива
        dynamicArray.print();

        // выводим размер массива
        System.out.println("Размер массива: " + dynamicArray.size());

        // удаляем элемент по индексу
        dynamicArray.remove(60);
        dynamicArray.print();

        // поиск индекса элемента массива
        int foundIndex = dynamicArray.findIndex(30);
        System.out.printf("foundIndex = %d\n", foundIndex);

        // поиск элемента по индексу
        int foundElement = dynamicArray.getElement(3);
        System.out.printf("foundElement = %d\n", foundElement);

        // проверка в массиве наличия элемента с заданным значением
        boolean availability = dynamicArray.contains(302);
        System.out.printf("availability = %b\n", availability);

        // удаляем все элементы со значением 30
        for (int i = 0; i < dynamicArray.size(); i++) {
            if (dynamicArray.getElement(i) == 30) {
                dynamicArray.remove(i);
                i--;
            }
        }

        // выводим размер массива после удаления элементов со значением 30
        System.out.println("Массив после удаления элемента:");
        dynamicArray.print();

        // изменяем элемент с индексом 0 на значение 11
        dynamicArray.setElement(0, 11);
        System.out.println("Массив после изменения значения элемента:");
        dynamicArray.print();

        // выводим минимальный элемент
        Integer min = (Integer) dynamicArray.getMinimum();
        System.out.println("Минимальное значение: " + min);

        // выводим максимальный элемент
        Integer max = (Integer) dynamicArray.getMaximum();
        System.out.println("Максимальное значение: " + max);

        // сумма элементов массива
        System.out.println("Сумма элементов: " + dynamicArray.sum());

        // произведение элементов массива
        System.out.println("Произведение элементов: " + dynamicArray.product());

        // новый массив типа double
        Double[] doubleArray = { 7.5, 2.5, 3.5, 1.5, 5.5 };
        DynamicArray<Double> doubleDynamicArray = new DynamicArray<>(doubleArray);
        System.out.println("Новый массив doubleArray: ");
        doubleDynamicArray.print();
        System.out.println("Сумма элементов массива doubleArray: " + doubleDynamicArray.sum());

        // пузырьковая сортировка для массива doubleArray
        doubleDynamicArray.bubbleSort();
        System.out.println("Отсортированный массив doubleArray: ");
        doubleDynamicArray.print();

        // сортировка вставками для массива dynamicArray
        dynamicArray.insertionSort();
        System.out.println("Отсортированный массив dynamicArray: ");
        dynamicArray.print();

        // новый массив типа Integer
        Integer[] intArray = { 7, 4, 5, -1, 0 };
        DynamicArray<Integer> intDynamicArray = new DynamicArray<>(intArray);
        System.out.println("Новый массив intArray: ");
        intDynamicArray.print();
        intDynamicArray.selectionSort();
        System.out.println("Отсортированный массив intArray: ");
        intDynamicArray.print();

        // удаление всех элементов массива dynamicArray
        dynamicArray.clear();
        dynamicArray.print();
    }
}

/* Результаты выполнения:
Элемент 0: 5
Элемент 1: 7
Элемент 2: 3
Элемент 3: -3
Размер массива: 4
Индекс находится за пределами допустимых значений
Элемент 0: 5
Элемент 1: 7
Элемент 2: 3
Элемент 3: -3
foundIndex = -1
foundElement = -3
availability = false
Массив после удаления элемента:
Элемент 0: 5
Элемент 1: 7
Элемент 2: 3
Элемент 3: -3
Массив после изменения значения элемента:
Элемент 0: 11
Элемент 1: 7
Элемент 2: 3
Элемент 3: -3
Минимальное значение: -3
Максимальное значение: 11
Сумма элементов: 18.0
Произведение элементов: -693.0
Новый массив doubleArray:
Элемент 0: 7.5
Элемент 1: 2.5
Элемент 2: 3.5
Элемент 3: 1.5
Элемент 4: 5.5
Сумма элементов массива doubleArray: 20.5
Отсортированный массив doubleArray:
Элемент 0: 1.5
Элемент 1: 2.5
Элемент 2: 3.5
Элемент 3: 5.5
Элемент 4: 7.5
Отсортированный массив dynamicArray:
Элемент 0: -3
Элемент 1: 3
Элемент 2: 7
Элемент 3: 11
Новый массив intArray:
Элемент 0: 7
Элемент 1: 4
Элемент 2: 5
Элемент 3: -1
Элемент 4: 0
Отсортированный массив intArray:
Элемент 0: -1
Элемент 1: 0
Элемент 2: 4
Элемент 3: 5
Элемент 4: 7
Массив пустой
 */
