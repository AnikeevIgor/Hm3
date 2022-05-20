package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Задание 2
        Random random = new Random();
        int clientOS = random.nextInt(2);
        int min = 2004;
        int max = 2022;
        int diff = max - min;
        int YerCreate = random.nextInt(diff + 1);
        YerCreate += min;
        System.out.println(YerCreate);
        if (clientOS == 1 && YerCreate >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (clientOS == 1 && YerCreate <= 2015)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && YerCreate >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            if (clientOS == 0 && YerCreate <= 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
// zadanie 3
        int year = 2021;
        int a = year % 4;
        int b = year % 100;
        int c = year % 400;
        if (a <= 0 && c <= b) {
            System.out.println("visok");
        } else {
            System.out.println("nevisok");
        }
// zadanie 4
        int deliveryDistance = 95;
        int days = 2;
        if (60 > deliveryDistance && deliveryDistance >= 20) {
            System.out.println("Потребуется дней: "+ days);
        } else
            if (100 >= deliveryDistance && deliveryDistance >= 60) {
                System.out.println("Потребуется дней: "+(days + 1));
            }
        else {
            System.out.println("Потребуется дней: " + (days - 1));
        }
        //zadanie 5
         int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;

            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}



