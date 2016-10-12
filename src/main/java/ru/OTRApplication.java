package ru;

import ru.IP.IpRange;
import ru.PhoneBook.PhoneBookRunner;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by oleg on 11.10.16.
 */
public class OTRApplication {

    public static void main(String[] args) throws UnknownHostException {

        Scanner reader = new Scanner(System.in);
        System.out.println("Выберите приложение!\n1 - Диапазон IP.\n2 - Телефонная книга.\n(1/2)");
        String znak = reader.next();
        switch (znak) {
            case "1":
                IpRange ipRange = new IpRange();
                ipRange.showRangeFull();
                break;
            case "2":
                PhoneBookRunner phoneBookRunner = new PhoneBookRunner();
                phoneBookRunner.runEx2();
                break;
        }
    }
}
