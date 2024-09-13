import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /* Дим, подскажи пожалуйста, почему, если нет завершающего else, то переменная message
        должна быть обязательно инициализирована.
        Но вряд ли за такое похвалят на реальной работе. Я не добавил else, потому что в условии
        нет задания, когда ребёнку менее 2-ух лет, а идти на работу в год, неправильно) */
        Scanner agePerson = new Scanner(System.in);
        String message;
        System.out.println("Пожалуйста, введите возраст человека.");
        int age = agePerson.nextByte();
        if (age >= 2 && age <= 6) {
            message = "нужно ходить в детский сад.";
        } else if (age >= 7 && age <= 18) {
            message = "нужно посещать школу.";
        } else if (age > 18 && age < 24) {
            message = "следует учиться в университете.";
        } else if (age >= 24) {
            message = "пора идти на работу";
        } else {
            message = "не надо никуда ходить. Он маленький.";
        }
        System.out.println("Если возраст человека равен " + age + ", то ему " + message);
    }
}