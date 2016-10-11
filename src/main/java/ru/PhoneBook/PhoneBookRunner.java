package ru.PhoneBook;

import java.util.*;

/**
 * Created by oleg on 11.10.16.
 */
public class PhoneBookRunner {

    public void runEx2() {
        Scanner reader = new Scanner(System.in);

        List<Phone> phones = createTestPhones();
        Map<String, User> users = createTestUsers();
        String exit = "н";

        while (!exit.equals("д")) {
            System.out.println("Введите ФИО (например Иванов И.И.)");
            String fio = reader.nextLine();
            String phoneNumbers = findPhoneByName(phones, users, fio);

            System.out.println(phoneNumbers);

            System.out.println("Выход? (д/н)");
            exit = reader.nextLine();
        }
    }

    protected String findPhoneByName(List<Phone> phones, Map<String, User> users, String fio) {

        String res = "";
        for (Map.Entry<String, User> user : users.entrySet()) {
            if (user.getValue().getName().equals(fio)) {
                for (Phone phone : phones) {
                    if (phone.getId().equals(user.getKey())) {
                        res += phone.getNum() + "\n";
                    }
                }
            }
        }
        if(!res.equals("")) {
            return res;
        } else {
            return "Такого значения не существует";
        }
    }

    private Map<String,User> createTestUsers() {
        HashMap<String, User> users = new HashMap<String, User>();
        users.put("1", new User("Иванов И.И."));
        users.put("2", new User("Борисов А.В."));
        users.put("3", new User("Мельников Л.Г."));
        users.put("4", new User("Новиков О.В."));
        users.put("5", new User("Сидоров К.Р."));
        users.put("6", new User("Васюков Е.Н."));
        users.put("7", new User("Носков Р.И."));
        users.put("8", new User("Коносов П.Н."));
        users.put("9", new User("Николаев И.Е."));
        users.put("10", new User("Романов Н.А."));
        return users;
    }

    private List<Phone> createTestPhones() {
        ArrayList<Phone> phones = new ArrayList<Phone>();
        phones.add(new Phone("1","+79155324567"));
        phones.add(new Phone("1","+79207432323"));
        phones.add(new Phone("2","+79049583729"));
        phones.add(new Phone("3","+79804534580"));
        phones.add(new Phone("4","+79151234536"));
        phones.add(new Phone("5","+79165675654"));
        phones.add(new Phone("5","+79564565337"));
        phones.add(new Phone("6","+79155324567"));
        phones.add(new Phone("7","+79207432323"));
        phones.add(new Phone("8","+79049583729"));
        phones.add(new Phone("8","+79804534580"));
        phones.add(new Phone("9","+79151234536"));
        phones.add(new Phone("10","+79165675654"));
        phones.add(new Phone("10","+79564565337"));
        return phones;
    }
}
