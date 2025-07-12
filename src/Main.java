//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задача 1");

        int clientOS1 = 1; //0 — iOS, 1 — Android
        if(clientOS1 == 1)
        {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else
        {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println("");

        System.out.println("Задача 2");

        int clientOS2 = 1; //0 — iOS, 1 — Android
        int clientDeviceYear = 2000;

        if(clientOS2 == 1 && clientDeviceYear >= 2015)
        {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if(clientOS2 == 1 && clientDeviceYear < 2015)
        {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if(clientOS2 == 0 && clientDeviceYear >= 2015)
        {
             System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else // if(clientOS2 == 0 && clientDeviceYear < 2015) // оставшийся вариант можно не проверять
        {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        System.out.println("");

        System.out.println("Задача 3");
        int year3 = 2013;
        // boolean isLeap = ((year3 % 4 == 0) && (year3 % 100 != 0)) || year3 % 400 == 0
        // Високосный год — это год, который делится на 4 и 400 без остатка.
        // Годы, делящиеся на 100, не являются високосными, если только не делятся на 400.
        boolean isLeap = (((year3 % 4 == 0) && (year3 % 100 != 0)) || (year3 % 400 == 0)) && (year3 > 1584);
        if(isLeap)
        {
            System.out.println(year3 + " год является високосным.");
        }
        else
        {
            System.out.println(year3 + " год не является високосным.");
        }
        System.out.println("");

        System.out.println("Задача 4");
        int deliveryDays = 0;
        int deliveryDistance = 95; // Дистанция в километрах до клиента
        if (deliveryDistance < 20)
        {
            System.out.println("Потребуется 1 день.");
        }
        else if (deliveryDistance < 60)
        {
            System.out.println("Потребуется 2 дня.");
        }
        else if (deliveryDistance <= 100)
        {
            System.out.println("Потребуется 3 дня.");
        }
        else System.out.println("Свыше 100 км доставки нет.");

        System.out.println("");

        System.out.println("Задача 5");
        {
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
            }
        }
    }
}