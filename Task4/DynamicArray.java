package HomeWork.Task4;

import java.util.NoSuchElementException;

public class DynamicArray<T extends Number> {

    private T[] array;
    private int size;

    public DynamicArray() {
        this.array = (T[]) new Number[10];
        this.size = 0;
    }

    public DynamicArray(T[] data) {
        this.array = (T[]) new Number[data.length];
        for (int i = 0; i < data.length; i++) {
            this.array[i] = data[i];
        }
        this.size = data.length;
    }

    /**
     * Вывод массива в консоль
     */
    public void print() {
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                System.out.println("Элемент " + i + ": " + array[i]);
            }
        } else {
            System.out.println("Массив пустой");
        }
    }

    /**
     * Получение размера массива
     * 
     * @return
     */
    public int size() {
        return this.size;
    }

    /**
     * Вставка в массив
     * 
     * @param element
     */
    public void add(T element) {
        if (this.size == this.array.length) {
            T[] newArray = (T[]) new Object[this.size * 2];
            for (int i = 0; i < this.size; i++) {
                newArray[i] = this.array[i];
            }
            this.array = newArray;
        }
        this.array[this.size] = element;
        this.size++;
    }

    /**
     * Удаление элемента по индексу
     * 
     * @param index
     */
    public void remove(int index) {
        if (index < 0 || index >= this.size) {
            System.out.println("Индекс находится за пределами допустимых значений");
        } else {
            for (int i = index; i < this.size - 1; i++) {
                this.array[i] = this.array[i + 1];
            }
            this.array[this.size - 1] = null;
            this.size--;
        }
    }

    /**
     * Удаление всех элементов
     */
    public void clear() {
        this.array = (T[]) new Number[10];
        this.size = 0;
    }

    /**
     * Принимает на вход элемент и возвращает его индекс в массиве.
     * Если элемент не найден, метод возвращает -1.
     * 
     * @param element
     * @return
     */
    public int findIndex(T element) {
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Принимает на вход элемент и возвращает true, если элемент
     * содержится в массиве, и false в противном случае.
     * 
     * @param element
     * @return
     */
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    /**
     * Получение элемента по индексу
     * 
     * @param index
     * @return
     */
    public T getElement(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Индекс находится за пределами допустимых значений");
            return null;
        } else {
            return array[index];
        }
    }

    /**
     * Замена элемента по индексу
     * 
     * @param index
     * @param element
     */
    public void setElement(int index, T element) {
        if (index < 0 || index >= this.size) {
            System.out.println("Индекс находится за пределами допустимых значений");
        } else {
            this.array[index] = element;
        }
    }

    /**
     * Поиск минимального элемента в массиве
     */
    public T getMinimum() {
        if (size == 0) {
            System.out.println("Массив пустой");
            return null;
        }
        T min = array[0];
        for (int i = 1; i < size; i++) {
            if (((Comparable<T>) array[i]).compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Поиск максимального элемента в массиве
     * 
     * @return
     */
    public T getMaximum() {
        if (size == 0) {
            System.out.println("Массив пустой");
            return null;
        }
        T max = array[0];
        for (int i = 1; i < size; i++) {
            if (((Comparable<T>) array[i]).compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * Поиск суммы элементов массива
     */
    public T sum() {
        T sum = null;
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                sum = array[i];
            } else {
                sum = (T) new Double(sum.doubleValue() + array[i].doubleValue());
            }
        }
        return sum;
    }

    /**
     * Поиск произведения элементов массива
     * 
     * @return
     */
    public T product() {
        T product = null;
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                product = array[i];
            } else {
                product = (T) new Double(product.doubleValue() * array[i].doubleValue());
            }
        }
        return product;
    }

    /**
     * Сортировка пузырьком
     */
    public void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j].doubleValue() > array[j + 1].doubleValue()) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Сортировка вставками
     */
    public void insertionSort() {
        for (int i = 1; i < size; i++) {
            T key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].doubleValue() > key.doubleValue()) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    /**
     * Сортировка выбором
     */
    public void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (array[j].doubleValue() < array[minIndex].doubleValue()) {
                    minIndex = j;
                }
            }
            T temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

}
