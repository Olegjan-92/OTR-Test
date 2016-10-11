package ru.IP;

import static org.junit.Assert.*;

/**
 * Created by oleg on 10.10.16.
 */
public class ip_rangeTest {
    @org.junit.Test
        void test() throws Exception {
        ip_range ip_range = new ip_range();
        ip_range.main("1.1.1.1", "1.1.1.3");
        assertEquals("1.1.1.2", ip_range.result);
    }

}