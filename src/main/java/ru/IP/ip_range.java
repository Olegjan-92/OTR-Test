package ru.IP;

import java.util.Scanner;

/**
 * Created by oleg on 10.10.16.
 */
public class ip_range {
    public static void main(String[] args) {
        int lastNumOfIpStart = 0;
        int lastNumOfIpEnd = 0;

        Scanner scanner = new Scanner(System.in);           //
        System.out.println("Введите начальный ip адрес:");  //
        String ipStart= scanner.nextLine();                 // Ввод двух IP-адресов
        System.out.println("Введите конечный ip адрес:");   //
        String ipEnd= scanner.next();                       //

        String[] NumOfIpStart = ipStart.split("\\.");
        String[] NumOfIpEnd = ipEnd.split("\\.");

        try {
            lastNumOfIpStart = Integer.valueOf(NumOfIpStart[NumOfIpStart.length-1]);
            lastNumOfIpEnd = Integer.valueOf(NumOfIpEnd[NumOfIpEnd.length-1]);
        }catch (NumberFormatException e){
            System.err.println("Неверный формат строки");
        }

        for (int i = lastNumOfIpStart+1; i<lastNumOfIpEnd; i++){
            System.out.printf("%s.%s.%s.%s",NumOfIpStart[0],NumOfIpStart[1],NumOfIpStart[2],i);
            System.out.println();
        }
    }
}
