package com.company;

public class Main {

    public static void main(String[] args) {
        int osType = 0;
        int produceYear = 2011;
        System.out.println("****Задание 1 и 2*********");
        if (osType == 0 && produceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (osType == 0 && produceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (osType == 1 && produceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (osType == 1 && produceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("****Задание 3*********");
        int year = 205;
        if (year % 4 == 0 && !(year % 100 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("****Задание 4*********");
        int deliveryDistance = 95;
        int day = 0;
        if (deliveryDistance < 20) {
            day += 1;
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            day += 2;
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            day += 3;
        }
        if (deliveryDistance >= 100) {
            day += 4;
        }
        System.out.println("Потребуется дней: " + day + " дней");

        System.out.println("****Задание 5*********");
        int monthNumber = 7;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Вы ввели неверно месяц");
        }
    }
}
