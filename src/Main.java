import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        task1();
        task2();
        task3();
        task4();
    }
    public static void checkLeapYear(int checkYear) {
        boolean leapYear = false;
        if (checkYear % 4 == 0 && checkYear % 400 == 0)
            leapYear = true;
        else if (checkYear % 100 == 0) {
            leapYear = false;
        } else leapYear = false;
        if (leapYear)
            System.out.println(checkYear + " год является високосным");
        else
            System.out.println(checkYear + " год НЕ является високосным");
    }
    public static void task1() {
        System.out.println("Задача 1:");
        int year = 2300;
        checkLeapYear(year);
    }
////////////////
    public static void osAndYear(int os, int year) {
        int clientDeviceYear = 2015;
        switch (os) {
            case 0:
                if (year <= clientDeviceYear) {
                    System.out.println("Установите ОБЛЕГЧЕННУЮ версию приложения для iOS по ссылке");
                    break;
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                }
            case 1:
                if (year <= clientDeviceYear) {
                    System.out.println("Установите ОБЛЕГЧЕННУЮ версию приложения для Android по ссылке");
                    break;
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                }
        }
    }
    public static void task2() {

        System.out.println("Задача 2:");

        int clientOS = 0;
        int clientDevice = LocalDate.now().getYear();
        System.out.printf("устройство клиента %s года%n", clientDevice);
        osAndYear(clientOS, clientDevice);
    }
////////////////
    public static int deliveryDay(int distance) {
        int deliveryDay = 1;
        if (distance <= 20) {
            deliveryDay += 0;
        } else if (distance > 20 && distance <= 60) {
            deliveryDay += 1;
        } else if (distance > 60 && distance <= 100) {
            deliveryDay += 2;
        } else deliveryDay = 0;
        return deliveryDay;
    }
    public static void task3() {
        System.out.println("Задача 3: ");
        int deliveryDistance = 125;

        switch (deliveryDay(deliveryDistance)) {
            case 0:
                System.out.println("Свыше 100 км доставки нет.");
                break;
            case 1:
            case 2:
            case 3:
                System.out.println("Потребуется дней: " + deliveryDay(deliveryDistance));
        }
    }
////////////////
    public static boolean LeapYear(int checkYear) {
        boolean leapYear = false;
        if (checkYear % 4 == 0 && checkYear % 400 == 0)
            leapYear = true;
        else if (checkYear % 100 == 0) {
            leapYear = false;
        } else leapYear = false;
        return leapYear;
    }

    public static void printYear(boolean whichYear, int presentYear) {
        if (whichYear)
            System.out.println(presentYear + " год является високосным");
        else
            System.out.println(presentYear + " год НЕ является високосным");
    }

    public static void task4() {
        System.out.println("Задача 1 доп решение:");
        int year = 2300;
        boolean b = LeapYear(year);
        printYear(b, year);
    }


}