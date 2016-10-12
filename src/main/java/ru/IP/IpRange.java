package ru.IP;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Scanner;

/**
 * Created by oleg on 10.10.16.
 */
public class IpRange {

    public void showRangeFull() throws UnknownHostException {
        Scanner scanner = new Scanner(System.in);           //
        System.out.println("Введите начальный ip адрес:");  //
        String ipStart= scanner.nextLine();                 // Ввод двух IP-адресов
        System.out.println("Введите конечный ip адрес:");   //
        String ipEnd= scanner.next();                       //

        Long numOfIpStart = ipToLong(ipStart);
        Long numOfIpEnd = ipToLong(ipEnd);

        String ips = getIpRange(numOfIpStart, numOfIpEnd);
        System.out.println(ips);
    }

    protected String getIpRange(Long numOfIpStart, Long numOfIpEnd) throws UnknownHostException {
        if (numOfIpEnd < numOfIpStart){
            return "Неверный диапазон адресов!";
        }
        StringBuilder builder = new StringBuilder();
        while (numOfIpStart < numOfIpEnd - 1){
            numOfIpStart++;
            builder.append(longToIp(numOfIpStart));
            builder.append("\n");
        }
        return builder.toString();
    }

    public static long ipToLong(String stringIp) throws UnknownHostException {
        InetAddress address = InetAddress.getByName(stringIp);
        ByteBuffer bb = ByteBuffer.allocate(4).wrap(address.getAddress());
        return (long)bb.getInt();
    }

    public static String longToIp(long longIp) throws UnknownHostException {
        ByteBuffer bb = ByteBuffer.allocate(4).putInt((int)longIp);
        InetAddress address = InetAddress.getByAddress(bb.array());
        return address.getHostAddress();
    }
}