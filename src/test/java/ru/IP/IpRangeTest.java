package ru.IP;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by oleg on 11.10.16.
 */
public class IpRangeTest {
    @Test
    public void getIpRange() throws Exception {
        IpRange ipRange = new IpRange();
        String text = ipRange.getIpRange(IpRange.ipToLong("192.168.0.254"), IpRange.ipToLong("192.168.1.1"));
        assertEquals(text, "192.168.0.255\n" + "192.168.1.0\n");
    }

    @Test
    public  void  getIpRangeFail() throws Exception {
        IpRange ipRange = new IpRange();
        String text = ipRange.getIpRange(IpRange.ipToLong("192.168.1.1"), IpRange.ipToLong("192.168.0.254"));
        assertEquals(text, "Неверный диапазон адресов!");
    }

}