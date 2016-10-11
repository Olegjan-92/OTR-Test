package ru.IP;

import static org.junit.Assert.*;

/**
 * Created by oleg on 10.10.16.
 */
public class ipRangeTest {
    @org.junit.Test
        void test() throws Exception {
        IpRange IpRange = new IpRange();
        IpRange.main("1.1.1.1", "1.1.1.3");
        assertEquals("1.1.1.2", IpRange.result);
    }

}