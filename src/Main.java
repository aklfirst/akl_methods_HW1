import java.time.LocalDate;

public class Main {


public static void main(String[] args) {
// Задание 1
    int year = 2040;
    checkYear(year);

// Задание 2
    int clientDeviceYear = 2019;
    String osType = "iOS";
    checkOS(osType, clientDeviceYear);

// Задание 2 альтернативное решение
    String messageToClient = checkOS1(osType,clientDeviceYear);
    System.out.println(messageToClient);

// Задание 3
    int clientDistance = 120;
    deliveryDays(clientDistance);
}

    public static void checkYear(int a) {
        if (java.time.Year.of(a).isLeap() == true) {
            System.out.println(a + " - високосный год");
        } else {
            System.out.println(a + " - НЕ високосный год");
        }

    }

    public static void checkOS(String OSname, int year) {
        int currentYear = LocalDate.now().getYear();
        if (OSname.equals("iOS") && year < 2015) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else if (OSname.equals("Android") && year < 2015) {
            System.out.println("Установите приложение для Android по ссылке");
        } else if (OSname.equals("iOS")) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else{
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }

    public static String checkOS1(String OSname, int year) {
        if (OSname.equals("iOS") && year < 2015) {
            return "Установите приложение для iOS по ссылке";
        } else if (OSname.equals("Android") && year < 2015) {
            return "Установите приложение для Android по ссылке";
        } else if (OSname.equals("iOS")) {
            return "Установите облегченную версию приложения для iOS по ссылке";
        } else{
            return "Установите облегченную версию приложения для Android по ссылке";
        }
    }

    public static void deliveryDays(double distance) {

        if (distance <= 20) {
            System.out.println("На доставку потребуются 1 сутки");
        } else {
            double daysCount = Math.ceil((distance - 20) / 40);
            System.out.println("На доставку потребуются 1 сутки и " + daysCount + " дней");
        }

    }
}
