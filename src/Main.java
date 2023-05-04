public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        task3();
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
        //Реализуйте метод, который получает в качестве параметра год,
        // проверяет, является ли он високосным, и выводит результат в консоль.

        int year = 2100;
        checkLeapYear(year);
        //printYear();

    }

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
        int clientDevice = 2000;
        osAndYear(clientOS, clientDevice);
    }

    public static void task3() {
        System.out.println("Задача 3: ");

    }
}