import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNumber = scanner.nextByte();
        switch (monthNumber) {
            case 1, 2, 3:
                System.out.println("Зима");
                break;
            case 4, 5, 6:
                System.out.println("Весна");
                break;
            case 7, 8, 9:
                System.out.println("Лето");
                break;
            case 10, 11, 12:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Введите пожалуйста число,  которое соответствует месяцу.");
        }
    }
}
