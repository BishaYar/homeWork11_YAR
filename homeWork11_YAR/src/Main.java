import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        int year = 1996;
        task_1(year);

        System.out.println("Task 2");
        short clientDeviceYear = 2013;
        int clientOS = 0;
        task_2(clientOS, clientDeviceYear);

        System.out.println("Task 3");
        int deliveryDistance = 95;
        int countDays = task_3(deliveryDistance);
        System.out.println("Потребуется дней: " + countDays);
    }

    public static void task_1 (int year)
    {
        if ((year > 1584) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " год — високосный год.");
        } else {
            System.out.println(year + " год — невисокосный год.");
        }
    }

    public static void task_2 (int clientOS, short clientDeviceYear)
    {
        String operationSystem;
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            operationSystem = "iOS";
        } else {
            operationSystem = "Android";
        }

        if (clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для " + operationSystem + " по ссылке.");
        } else {
            System.out.println("Установите версию приложения для " + operationSystem + " по ссылке.");
        }
    }

    public static int task_3(int deliveryDistance) {
        int countDays = -1;
        if (deliveryDistance <= 20)
            countDays = 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60)
            countDays = 2;
        if (deliveryDistance > 60 && deliveryDistance <= 100)
            countDays = 3;
        return countDays;
    }
}