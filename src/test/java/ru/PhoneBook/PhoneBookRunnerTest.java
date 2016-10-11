package ru.PhoneBook;



import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by oleg on 11.10.16.
 */
public class PhoneBookRunnerTest {

    @Test
    public void findPhoneByName() throws Exception {
        HashMap<String, User> users = new HashMap<String, User>();
        users.put("1", new User("Иванов И.И."));


        ArrayList<Phone> phones = new ArrayList<Phone>();
        phones.add(new Phone("1","+79155324567"));
        phones.add(new Phone("1","+79207432323"));

        PhoneBookRunner phoneBookRunner = new PhoneBookRunner();
        String phone = phoneBookRunner.findPhoneByName(phones, users, "Иванов И.И.");
        String failPhone = phoneBookRunner.findPhoneByName(phones, users, "");
        assertEquals(phone, "+79155324567\n+79207432323\n");
        assertEquals(failPhone, "Такого значения не существует");
    }


}