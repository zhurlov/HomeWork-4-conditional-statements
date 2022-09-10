public class Main {
    public static void main(String[] args) {

        // Условный оператор. Урок 2.

        // Задание 1.
        int clientOs = 1;
        if (clientOs < 1) {
            System.out.println("установите версию приложения для iOS по ссылке");
        }
            else  {
                System.out.println("установите версию приложения для Android по ссылке");
            }
        // Задание 2.
        int clientDeviceYear = 2003;
            if (clientDeviceYear <= 2014) {
                System.out.println("установите облегченную версию приложения для Android по ссылке");
            }
            else {
                System.out.println("установка приложения для Android");
            }
            if (clientDeviceYear <= 2014) {
                System.out.println("установите облегченную версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("установка приложения для iOS");
            }
            // Задание 3.
        int year = 2022;
            switch (year) {
                case 2004:
                case 2008:
                case 2012:
                case 2016:
                case 2020:
                case 2024:
                    System.out.println(year + " год является високосным");
                    break;
                case 2015:
                case 2017:
                case 2018:
                case 2019:
                case 2021:
                case 2022:
                case 2023:
                case 2025:
                case 2026:
                case 2027:
                    System.out.println(year + " год не является високосным");
                    break;
            }

            // Задание 4.
            int deliveryDistance = 95;
            if (deliveryDistance <= 20) {
                System.out.println("доставка занимает 1 сутки");
            }
            else if (deliveryDistance < 21 || deliveryDistance <=60) {
                System.out.println("доставка занимает 2 суток");
            }
            else if (deliveryDistance <= 100) {
                System.out.println("доставка занимает 3 суток");
            }
            else {
                    System.out.println("расстояние превышает зону покрытия территории банка");
            }
            // Задание 5.
        int monthNumber = 7;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("зимний месяц");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("весенний месяц");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("летний месяц");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("осенний месяц");
                    break;
                default:
                    System.out.println("в году всего 12 месяцев");
            }





















    }

}

















