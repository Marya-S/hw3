package com.company;

public class Main<a> {

    public static void main(String[] args) {
        int osType = 0;
        int produceYear = 2011;
        System.out.println("****Задание 1 и 2*********");
        if (osType == 0 && produceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (osType == 0 && produceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (osType == 1 && produceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (osType == 1 && produceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("****Задание 3*********");
        int year = 1600;
        if (year % 4 == 0 && (!(year % 100 == 0) || (year % 400 == 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("****Задание 4*********");
        int deliveryDistance = 95;
        int day = 0;
        if (deliveryDistance < 20) {
            day += 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            day += 2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            day += 3;
        } else if (deliveryDistance >= 100) {
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

        System.out.println("****Задание 6*********");
        int age = 19;
        int salary = 65000;
        int limit;

        if (age >= 23) {
            limit = 3 * salary;
        } else {
            limit = 2 * salary;
        }
        if (salary >= 50000 && salary < 80000) {
            limit *= 1.2;
        }
        if (salary >= 80000) {
            limit *= 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
        System.out.println("****Задание 7*********");
        double baseRate = 10;
        int loanTerm = 12;
        int salary2 = 85000;
        int wantedSum = 330000;
        int age2 = 23;
        double maxInstallment = 0.5 * salary2;

        if (age2 < 30) {
            baseRate += 0.5;
        }
        if (salary2 > 80000) {
            baseRate -= 0.7;
        }
        double installment = (wantedSum * baseRate / 100 + wantedSum) / loanTerm;
        if (installment <= maxInstallment) {
            System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxInstallment + " рублей. " +
                    "Платеж по кредиту " + installment + " рублей. Одобрено");
        }
        else{
            System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxInstallment + " рублей. " +
                    "Платеж по кредиту " + installment + " рублей. Отказано");
        }

    }
}
