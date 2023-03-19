import java.util.List;
import java.util.Scanner;

public class ConsoleView {

    private PhoneBook addressBook;
    private Scanner scanner;

    public ConsoleView(PhoneBook addressBook) {
        this.addressBook = addressBook;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;
        while (running) {
            System.out.println("Выберите действие: ");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Удалить контакт");
            System.out.println("3. Обновить контакт");
            System.out.println("4. Поиск по телефону");
            System.out.println("5. Импорт из CSV");
            System.out.println("6. Экспорт в CSV");
            System.out.println("7. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Введите email для поиска:");
                    String email = scanner.nextLine();
                    List<Contact> contacts = addressBook.searchByEmail(email);
                    if (contacts.isEmpty()) {
                        System.out.println("Контакт не найден");
                    } else {
                        for (Contact contact : contacts) {
                            System.out.println(contact);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Введите email для поиска:");
                    String email = scanner.nextLine();
                    List<Contact> contacts = addressBook.searchByEmail(email);
                    if (contacts.isEmpty()) {
                        System.out.println("Контакт не найден");
                    } else {
                        for (Contact contact : contacts) {
                            System.out.println(contact);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Введите имя файла:");
                    String fileName = scanner.nextLine();
                    addressBook.importFromCSV(fileName);
                    System.out.println("Импортированные контакты из " + fileName);
                    break;
                case 3:
                    System.out.println("Введите имя файла:");
                    fileName = scanner.nextLine();
                    addressBook.exportToCSV(fileName);
                    System.out.println("Экспортированные контакты в " + fileName);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }
}
