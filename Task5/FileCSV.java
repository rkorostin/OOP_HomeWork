import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 Класс FileCSV содержит статические методы для чтения и записи данных в файл CSV. 
 Методы writeToCSV() и readFromCSV() используются для записи и чтения данных в формате CSV соответственно.
 В качестве аргументов метод writeToCSV() принимает список контактов и имя файла. 
 Он создает новый PrintWriter для записи данных в файл и формирует строку заголовка и строки данных в формате CSV. 
 Затем он записывает эти строки в файл.
 Метод readFromCSV() принимает имя файла в качестве аргумента и возвращает список контактов, прочитанных из файла. 
 Он создает новый Scanner для чтения данных из файла, пропускает строку заголовка и затем читает каждую 
 строку данных и создает новый объект Contact для каждой строки.
 */

public class FileCSV {
    public static void writeToCSV(List<Contact> contacts, String fileName) {
        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            StringBuilder sb = new StringBuilder();
            sb.append("id,Имя,Фамилия,Телефон\n");

            for (Contact contact : contacts) {
                sb.append(contact.getIdContact()).append(",");
                sb.append(contact.getFirstName()).append(",");
                sb.append(contact.getLastName()).append(",");
                sb.append(contact.getPhone()).append("\n");
            }

            writer.write(sb.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + fileName);
        }
    }

    public static List<Contact> readFromCSV(String fileName) {
        List<Contact> contacts = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(fileName))) {
            scanner.nextLine();

            while (scanner.hasNextLine()) {
                String[] fields = scanner.nextLine().split(",");
                Contact contact = new Contact(fields[0], fields[1], fields[2], fields[3]);
                contacts.add(contact);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + fileName);
        }

        return contacts;
    }

}
