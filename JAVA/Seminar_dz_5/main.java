import java.util.*;

class PhoneBook {
    private Map<String, Set<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        Set<String> phoneNumbers = contacts.getOrDefault(name, new HashSet<>());
        phoneNumbers.add(phoneNumber);
        contacts.put(name, phoneNumbers);
    }

    public void printAllContacts() {
        List<Map.Entry<String, Set<String>>> sortedEntries = new ArrayList<>(contacts.entrySet());
        sortedEntries.sort((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()));

        for (Map.Entry<String, Set<String>> entry : sortedEntries) {
            String name = entry.getKey();
            Set<String> phoneNumbers = entry.getValue();

            System.out.println(name + ": " + phoneNumbers);
        }
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        System.out.print("Введите фамилию и телефонный номер (через пробел) или 'q' для завершения: ");
        String input = scanner.nextLine();

        while (!input.equals("q")) {
            String[] parts = input.split(" ");
            String name = parts[0];
            String phoneNumber = parts[1];

            phoneBook.addContact(name, phoneNumber);

            System.out.print("Введите фамилию и телефонный номер (через пробел) или 'q' для завершения: ");
            input = scanner.nextLine();
        }

        System.out.println("Телефонная книга:");
        phoneBook.printAllContacts();
    }
}