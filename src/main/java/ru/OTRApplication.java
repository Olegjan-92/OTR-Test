package ru;

import ru.IP.IpRange;
import ru.PhoneBook.PhoneBookRunner;

import java.net.UnknownHostException;
import java.util.ArrayList;

/**
 * Created by oleg on 11.10.16.
 */
public class OTRApplication {

    public static void main(String[] args) throws UnknownHostException {
        PhoneBookRunner phoneBookRunner = new PhoneBookRunner();
        //phoneBookRunner.runEx2();

        IpRange ipRange = new IpRange();
        ipRange.showRangeFull();
    }
}
