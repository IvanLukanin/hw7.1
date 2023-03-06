public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOC = 0;
        if (clientOC == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOC = 1;
        int clientYear = 2016;
        if (clientOC == 0) {
            if (clientYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 88;
        int deliveryDay = 1;

        if (deliveryDistance > 20) {
            deliveryDay++;
        }

        if (deliveryDistance > 60) {
            deliveryDay++;
        }
        System.out.println("Потребуется дней: " + deliveryDay);
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 14;
        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
                System.out.println("Лето");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Осень");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Зима");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Весна");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}