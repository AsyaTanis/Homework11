import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2100;
        if (printYear(year) == true) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Задача 2");
        byte clientOS = 0;
        int clientDeviceYear = 2014;
        //int clientDeviceYear = LocalDate.now().getYear();
        System.out.println(printOS(clientOS, clientDeviceYear));

        System.out.println("Задача 3");
        int deliveryDistance = 44;
        System.out.println("В случае отсутствия достваки, будет записано 0 дней. в ином случае, будет вывоится количество. " +
                "Доставка равна: " +
                printDays(deliveryDistance));

    }

    private static int printDays(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance < 20) {
        } else if ((deliveryDistance >= 20 && deliveryDistance < 60)) {
            day = day + 1;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            day = day + 2;
        } else if (deliveryDistance > 100) {
            day = 0;
        }
        return day;
    }


    public static String printOS(byte clientOS, int clientDeviceYear) {
        switch (clientOS) {
            case 0:
                if (clientDeviceYear >= 2015) {
                    return "Установите версию приложения для iOS по ссылке";
                } else {
                    return "Установите облегченную версию приложения для iOS по ссылке";
                }
            case 1:
                if (clientDeviceYear >= 2015) {
                    return "Установите версию приложения для Android по ссылке";
                } else {
                    return "Установите облегченную версию приложения для Android по ссылке";
                }
            default:
                return "Приложение не поддерживается данной операционной системой";
        }
    }

    public static boolean printYear(int year) {
                if (( year % 4 == 0 && year % 100 == 0 && year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    return true;
                } else {
                    return false;
        }
    }
}