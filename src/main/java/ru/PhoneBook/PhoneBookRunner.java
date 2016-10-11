package ru.PhoneBook;

import java.util.*;

/**
 * Created by oleg on 11.10.16.
 */
public class PhoneBookRunner {
    public static void main(String[] args) throws InputMismatchException {

        Scanner reader = new Scanner(System.in);

        List<Phones> phones = new ArrayList<Phones>();
        phones.add(new Phones("1","+79155324567"));
        phones.add(new Phones("1","+79207432323"));
        phones.add(new Phones("2","+79049583729"));
        phones.add(new Phones("3","+79804534580"));
        phones.add(new Phones("4","+79151234536"));
        phones.add(new Phones("5","+79165675654"));
        phones.add(new Phones("5","+79564565337"));
        phones.add(new Phones("6","+79155324567"));
        phones.add(new Phones("7","+79207432323"));
        phones.add(new Phones("8","+79049583729"));
        phones.add(new Phones("8","+79804534580"));
        phones.add(new Phones("9","+79151234536"));
        phones.add(new Phones("10","+79165675654"));
        phones.add(new Phones("10","+79564565337"));


        Map<String, User> users = new HashMap<String, User>();
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

        String exit = "н";
            while (!exit.equals("д")) {
                System.out.println("Введите ФИО (например Иванов И.И.)");
                String fio = reader.nextLine();

                for (Map.Entry<String, User> user : users.entrySet()) {
                    if (user.getValue().getName().equals(fio)) {
                        for (Phones phone : phones) {
                            if (phone.getId().equals(user.getKey())) {
                                System.out.println(phone.getNum());
                            }
                        }
                    }
                }
                System.out.println("Выход? (д/н)");
                exit = reader.nextLine();
            }
    }
}
