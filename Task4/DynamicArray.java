package HomeWork.Task4;

public class DynamicArray<T> {

    private T[] array;
    private int size;

    public DynamicArray() {
        this.array = (T[]) new Object[10];
        this.size = 0;
    }

    public DynamicArray(T[] data) {
        this.array = (T[]) new Object[data.length];
        for (int i = 0; i < data.length; i++) {
            this.array[i] = data[i];
        }
        this.size = data.length;
    }

    public int size() {
        return this.size;
    }

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

    public T get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        return this.array[index];
    }

    public void set(int index, T element) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        this.array[index] = element;
    }

    public void remove(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < this.size - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
        this.array[this.size - 1] = null;
        this.size--;
    }

    public void clear() {
        this.array = (T[]) new Object[10];
        this.size = 0;
    }
}

// public class DynamicArray<T> {
// private T[] array;

// public DynamicArray() {
// this.array = (T[]) new Object[0];
// }

// public DynamicArray(T[] data) {
// this.array = data;
// }

// public void append(T element) {
// T[] newArray = (T[]) new Object[array.length + 1];
// for (int i = 0; i < array.length; i++) {
// newArray[i] = array[i];
// }
// newArray[array.length] = element;
// array = newArray;
// }

// public T pop() {
// T[] newArray = (T[]) new Object[array.length - 1];
// T element = array[array.length - 1];
// for (int i = 0; i < newArray.length; i++) {
// newArray[i] = array[i];
// }
// array = newArray;
// return element;
// }

// public T get(int index) {
// return array[index];
// }

// public void set(int index, T value) {
// array[index] = value;
// }

// public int size() {
// return array.length;
// }

// public void clear() {
// this.array = (T[]) new Object[0];
// }

// public String toString() {
// StringBuilder stringBuilder = new StringBuilder();
// stringBuilder.append("[");
// for (int i = 0; i < array.length; i++) {
// stringBuilder.append(array[i]);
// if (i != array.length - 1) {
// stringBuilder.append(", ");
// }
// }
// stringBuilder.append("]");
// return stringBuilder.toString();
// }
// }
