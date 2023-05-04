public class Main {
    public static void main(String[] args) {
        task1();
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

//    public static void printYear(boolean leapYear) {
//        if (leapYear) {
//            System.out.println("год является високосным");
//        } else {
//            System.out.println("год НЕ является високосным");
//        }
//    }

    public static void task1() {
        System.out.println("Задача 1");
        //Реализуйте метод, который получает в качестве параметра год,
        // проверяет, является ли он високосным, и выводит результат в консоль.

        int year = 2100;
        checkLeapYear(year);
        //printYear();
    }
}