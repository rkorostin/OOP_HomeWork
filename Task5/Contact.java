/**
 * Класс Contact содержит три поля: имя, фамилия и номер телефона.
 * Есть конструктор для создания нового контакта и методы доступа к полям.
 * Также перегружен метод toString() для строкового представления объекта
 * Contact
 */

public class Contact {
    private String firstName;
    private String lastName;
    private String phone;

    public Contact(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Контакт{" +
                "Имя='" + firstName + '\'' +
                ", Фамилия='" + lastName + '\'' +
                ", Телефон='" + phone + '\'' +
                '}';
    }
}