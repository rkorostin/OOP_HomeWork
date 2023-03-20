import java.util.ArrayList;
import java.util.List;

/*
Класс PhoneBook содержит список контактов в виде телефонной книги. 
Каждый контакт представлен объектом класса Contact. Класс PhoneBook имеет следующие поля:
- contacts - список контактов телефонной книги
- fileCSV - объект класса FileCSV, который используется для импорта и экспорта контактов из/в CSV файл
 */
public class PhoneBook {
    private List<Contact> contacts;
    private FileCSV fileCSV;

    /**
     * Конструктор класса PhoneBook создает список контактов из файла contacts.csv
     * и создает объект класса FileCSV.
     */
    public PhoneBook() {
        contacts = FileCSV.readFromCSV("contacts.csv");
        fileCSV = new FileCSV();
    }

    // Методы класса PhoneBook

    // добавляет контакт в список контактов и записывает контакт в contacts.csv
    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Контакт успешно добавлен");
        FileCSV.writeToCSV(contacts, "contacts.csv");
    }

    // удаляет контакт из списка контактов по id и перезаписывает contacts.csv
    public void removeContact(String idContact) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getIdContact().equals(idContact)) {
                contacts.remove(i);
                System.out.println("Контакт успешно удален");
                FileCSV.writeToCSV(contacts, "contacts.csv");
                return;
            }
        }
        System.out.println("Контакт не найден");
    }

    /*
     * обновляет данные контакта в списке контактов и записывает в contacts.csv
     */
    public void updateContact(String idContact, String newFirstName, String newLastName, String newPhone) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getIdContact().equals(idContact)) {
                Contact contact = contacts.get(i);
                contact.setFirstName(newFirstName);
                contact.setLastName(newLastName);
                contact.setPhone(newPhone);
                System.out.println("Контакт успешно обновлен");
                FileCSV.writeToCSV(contacts, "contacts.csv");
                return;
            }
        }
        System.out.println("Контакт не найден");
    }

    // поиск контактов, у которого имя совпадает с заданным
    public void searchByName(String name) {
        List<Contact> result = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(name)) {
                result.add(contact);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Контакт не найден");
        } else {
            for (Contact contName : result) {
                System.out.println(contName);
            }
        }
    }

    // поиск контакта, у которого номер телефона совпадает с заданным
    public void searchByPhone(String phone) {
        List<Contact> result = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getPhone().equals(phone)) {
                result.add(contact);
            }
        }
        if (result.isEmpty()) {
            System.out.println("Контакт не найден");
        } else {
            for (Contact contPhone : result) {
                System.out.println(contPhone);
            }
        }
    }

    // импортирует список контактов из CSV файла с заданным именем файла.
    // Файл должен содержать данные в формате "id,имя,фамилия,номер телефона"
    public void importFromCSV(String fileName) {
        List<Contact> importedContacts = fileCSV.readFromCSV(fileName);
        contacts.addAll(importedContacts);
        FileCSV.writeToCSV(contacts, "contacts.csv");
        System.out.println("В телефонный справочник добавлены контакты из файла " + fileName);
    }

    // экспортирует список контактов в CSV файл с заданным именем файла.
    // Файл будет содержать данные в формате "id,имя,фамилия,номер телефона"
    public void exportToCSV(String fileName) {
        fileCSV.writeToCSV(contacts, fileName);
        System.out.println("Контакты телефонного справочника экспортированы в файл " + fileName);
    }

    // возвращает список контактов, прочитанных из файла contacts.csv
    public void displayContacts() {
        List<Contact> csvContacts = FileCSV.readFromCSV("contacts.csv");
        System.out.println("Телефонный справочник:");
        for (Contact contact : csvContacts) {
            System.out.println(contact);
        }
    }

}