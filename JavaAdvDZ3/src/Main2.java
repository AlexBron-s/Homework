//2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
//телефонных номеров. В этот телефонный справочник с помощью метода add() можно
//добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
//учесть, что под одной фамилией может быть несколько телефонов (в случае
//однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
//Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
//взаимодействие с пользователем через консоль и т.д). Консоль использовать только для вывода
//результатов проверки телефонного справочника.
public class Main2 {

    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();

        phonebook.addPerson(new Person("Иванов", 89999999999L,"Ivan@mail.com"));
        phonebook.addPerson(new Person("Петров", 80000000000L,"Petrov@mail.com"));
        phonebook.addPerson(new Person("Иванов", 81111111111L,"Ivannov@mail.ru"));
        phonebook.addPerson(new Person("Петров", 82222222222L,"Pettrov@gmail.com"));

        System.out.println(phonebook.getPhoneNumber("Иванов"));
        System.out.println(phonebook.getEmail("Петров"));
    }
}
