import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Contact> contacts = new ArrayList<>();

        // Добавление контакта в телефонную книгу
        Contact contact1 = new Contact("Иван", "Иванов", "111-111-1111", "ivan@email.com");
        Contact contact2 = new Contact("Мария", "Смирнова", "222-222-2222", "maria@email.com");
        Contact contact3 = new Contact("Ольга", "Петрова", "333-333-3333", "olga@email.com");
        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);

        // запись в файл csv
        FileCSV.writeToCSV(contacts, "contacts.csv");

        // Чтение из файла csv
        List<Contact> csvContacts = FileCSV.readFromCSV("contacts.csv");
        System.out.println("Телефонный справочник:");
        for (Contact contact : csvContacts) {
            System.out.println(contact);
        }

        // Cоздать экземпляр класса PhoneBook и передать его в конструктор ConsoleView. 
        // Затем вызвать метод start() объекта ConsoleView, чтобы запустить интерфейс командной строки для работы с телефонной книгой.
        // PhoneBook phoneBook = new PhoneBook();
        // ConsoleView consoleView = new ConsoleView(phoneBook);
        // consoleView.start();

    }

}
