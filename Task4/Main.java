package HomeWork.Task4;

public class Main {
    public static void main(String[] args) {

        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
    
        // добавляем элементы
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
    
        // выводим размер массива
        System.out.println("Размер массива: " + dynamicArray.size());

         // выводим элементы массива
         for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println("Элемент " + i + ": " + dynamicArray.get(i));
        }
        
        // удаляем элемент по индексу
        dynamicArray.remove(1);
        
        // выводим размер массива после удаления элемента
        System.out.println("Размер массива после удаления элемента: " + dynamicArray.size());
        
        // выводим элементы массива после удаления элемента
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println("Элемент " + i + ": " + dynamicArray.get(i));
        }
        
        // удаляем все элементы со значением 30
        for (int i = 0; i < dynamicArray.size(); i++) {
            if (dynamicArray.get(i) == 30) {
                dynamicArray.remove(i);
                i--;
            }
        }
        
        // выводим размер массива после удаления элементов со значением 30
        System.out.println("Размер массива после удаления элементов со значением 30: " + dynamicArray.size());
        
        // выводим элементы массива после удаления элементов со значением 30
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println("Элемент " + i + ": " + dynamicArray.get(i));
        }
    }
}
