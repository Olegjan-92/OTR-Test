package ru.IP;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Scanner;

/**
 * Created by oleg on 10.10.16.
 */
public class IpRange {

//    public void showRange() throws UnknownHostException {

//        int lastNumOfIpStart = 0; // последнее число начального адреса
//        int lastNumOfIpEnd = 0;   // последнее число конечного адреса
//
//        Scanner scanner = new Scanner(System.in);           //
//        System.out.println("Введите начальный ip адрес:");  //
//        String ipStart= scanner.nextLine();                 // Ввод двух IP-адресов
//        System.out.println("Введите конечный ip адрес:");   //
//        String ipEnd= scanner.next();                       //
//
//        String[] NumOfIpStart = ipStart.split("\\.");  //разделение на подмассывы
//        String[] NumOfIpEnd = ipEnd.split("\\.");      //
//
//        try {                                                                           //
//            lastNumOfIpStart = Integer.valueOf(NumOfIpStart[NumOfIpStart.length-1]);    //
//            lastNumOfIpEnd = Integer.valueOf(NumOfIpEnd[NumOfIpEnd.length-1]);          //перевод в int последних чисел адресов
//        }catch (NumberFormatException e){                                               //
//            System.err.println("Неверный формат строки");                               //
//        }
//
//        for (int i = lastNumOfIpStart+1; i<lastNumOfIpEnd; i++){
//            String result = NumOfIpStart[0] + "." + NumOfIpStart[1] + "." + NumOfIpStart[2] + "." + i;
//            //System.out.printf("%s.%s.%s.%s",NumOfIpStart[0],NumOfIpStart[1],NumOfIpStart[2],i);
//            System.out.println(result);
//        }
//    }



    public void showRangeFull() throws UnknownHostException {
        Scanner scanner = new Scanner(System.in);           //
        System.out.println("Введите начальный ip адрес:");  //
        String ipStart= scanner.nextLine();                 // Ввод двух IP-адресов
        System.out.println("Введите конечный ip адрес:");   //
        String ipEnd= scanner.next();                       //

        Long numOfIpStart = ipToLong(ipStart);
        Long numOfIpEnd = ipToLong(ipEnd);

//        System.out.println(numOfIpEnd);
//        System.out.println(numOfIpStart);

        if(numOfIpEnd < numOfIpStart) {
            System.out.println("Неверный диапазон адресов!");
            return;
        }

        String ips = getIpRange(numOfIpStart, numOfIpEnd);
        System.out.println(ips);

    }

    protected String getIpRange(Long numOfIpStart, Long numOfIpEnd) throws UnknownHostException {
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