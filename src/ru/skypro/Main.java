package ru.skypro;

public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для ios по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        ;
        int year = 2008;
        if (year % 4 == 0 && year % 1000 != 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
        ;
        int distance = 40;
        int day = 1;
        if (distance <= 20) {
            System.out.println("Потребуется дней: " + day);
        } else if (distance > 20 && distance <= 60) {
            System.out.println("Потребуется дней: " + (day + 1));
        } else if (distance > 60 && distance < 100) {
            System.out.println("Потребуется дней: " + (day + 2));
        } else {
            System.out.println("Потребуется дней: " + (day + 3));
        }
        ;
        int month = 10;
        switch (month) {
            case 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");

            case 9, 10, 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
        }
    }
}

