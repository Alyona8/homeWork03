import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
    //Задание 1
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Задание 2
        int productionYear = 2015;
        int deviceYear = 2014;
        if (deviceYear < productionYear) {
            System.out.print("Установите облегченную версию приложения для ");
        } else {
            System.out.print("Установите версию приложения для ");
        }
        if (clientOS == 1) {
            System.out.println("Android по ссылке");
        } else {
            System.out.println("iOS по ссылке");
        }

        //Задание 3
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Задание 4
        int deliveryDistance = 95;
        int deliveryDays = 1;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistance <= startInterval) {
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance - startInterval)/ (double) interval);
        }
        System.out.println("Потребуется дней: " + deliveryDays);

        //Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }



        //Задание 6
        int age = 19;
        int salary = 58_000;
        double limit;
        if (age < 23) {
            limit = salary * 2;
        } else {
            limit = salary * 3;
        }
        if (salary >= 50_000) {
            limit *= 1.2;
        } else if (salary >= 80_000) {
            limit *= 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей.");


        //Задание 7
        int age1 = 25;
        int salary1 = 60_000;
        int wantedSum = 330_000;
        int maxPayment = salary / 2;
        int creditTerm = 12;
        float interestRate = 10;
        if (age1 < 23) {
            interestRate++;
        } else if (age1 < 30) {
            interestRate += 0.5;
        }
        if (salary1 > 80_000) {
            interestRate -= 0.7;
        }
        float creditSum = wantedSum * (1 + (interestRate / 100));
        float payment = creditSum / creditTerm;
        System.out.println("Ваш максимальный платеж: " + maxPayment + ". Платеж по кредиту: " + payment);
        if (payment > maxPayment) {
            System.out.println("Отказано.");
        } else {
            System.out.println("Одобрено.");
        }
    }
}




