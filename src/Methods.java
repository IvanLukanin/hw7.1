import java.time.LocalDate;
public class Methods {
    public static void main(String[] args) {

        var result = returnTheTotalNumberOfDeliveryDays(50);
        System.out.println("Задача 1");
        if (result == -1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Доставка займёт " + result + " дня");
        }

        int year = 2021;
        printLeapYear(year);

        printVersion(1, 2022);
    }

    public static int returnTheTotalNumberOfDeliveryDays(int deliveryDistance) {
        if (deliveryDistance > 100) {
            return - 1;
        }
        int deliveryDay = 1;
        if (deliveryDistance > 20) {
            deliveryDay++;
        }
        if (deliveryDistance > 60) {
            deliveryDay++;
        }
        return deliveryDay;
    }

    public static void printLeapYear(int year) {
        System.out.println("Задача 2");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void printVersion(int os, int year) {
        System.out.println("Задача 3");
        int currentYear = LocalDate.now().getYear();
        if (currentYear == year && os == 1) {
            System.out.println("Установите обычную версию для Android");
        } else if (currentYear > year && os == 1) {
            System.out.println("Установите облегчённую версию для Android");
        } else if (currentYear == year && os == 0) {
            System.out.println("Установите обычную версию для iOC");
        } else {
            System.out.println("Установите облегчённую версию для iOC");
        }
    }
}
