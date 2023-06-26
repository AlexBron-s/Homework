import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Phonebook {
    private final HashMap<String, List<Person>> phoneNumberList = new HashMap<>();

    public void addPerson(Person person) {
        List<Person> personList = new ArrayList<>();
        if (phoneNumberList.containsKey(person.surname)) {
            personList = phoneNumberList.get(person.surname);
        }
        personList.add(person);
        phoneNumberList.put(person.surname, personList);
    }

    public List<Long> getPhoneNumber(String surname) {
        List<Long> phoneNumbers = new ArrayList<>();
        phoneNumberList.get(surname).forEach(person -> phoneNumbers.add(person.phone));
        return phoneNumbers;
//        return phoneNumberList.get(surname).stream().map(Person::getPhone).toList();
    }

    public List<String> getEmail(String surname) {
        List<String> emails = new ArrayList<>();
        phoneNumberList.get(surname).forEach(person -> emails.add(person.e_mail));
        return emails;
    }
}
