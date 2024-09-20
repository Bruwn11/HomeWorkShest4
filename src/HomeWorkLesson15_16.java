import java.util.Scanner;

public class HomeWorkLesson15_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Пожалуйста, введите вашу строку.");
        String str1 = scan.nextLine();
        task1(str1);
        String str2 = "I like Java!!!";
        task2(str2);
        System.out.println("Пожалуйста введите вторую строку.");
        String str3 = scan.nextLine();
        task3(str3);
    }

    public static void task1(String str) {
        int quantityLetterUp = 0;
        int quantityLetterLow = 0;
        int quantityDigit0_4 = 0;
        int quantityDigit5_9 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                char ch = str.charAt(i);
                if (Character.isUpperCase(ch)) {
                    quantityLetterUp += 1;
                } else if (Character.isLowerCase(ch)) {
                    quantityLetterLow += 1;
                }
            } else if (Character.isDigit(str.charAt(i))) {
                int x = Integer.parseInt(String.valueOf(str.charAt(i)));
                if (x <= 4) {
                    quantityDigit0_4 += 1;
                } else if (x <= 9) {
                    quantityDigit5_9 += 1;
                }
            }
        }
        System.out.println("В вашей строке: цифр от 0 до 4 = " + quantityDigit0_4 + ", цифр от 5 до 9 = " + quantityDigit5_9 + ", заглавных букв = " + quantityLetterUp + ", строчных букв " + quantityLetterLow);
    }

    public static void task2(String str) {
        System.out.println(str.charAt(str.length() - 1));
        if (str.endsWith("!!!")) {
            System.out.println("Введённая вами строка " + str + " заканчивается подстрокой: !!!");
        }
        if (str.startsWith("I like")) {
            System.out.println("Введённая вами строка " + str + " начинается подстрокой: I like");
        }
        if (str.contains("Java")) {
            System.out.println("Введённая вами строка " + str + " содержит подстроку: Java");
        }
        int position = str.indexOf("Java");
        System.out.println("Позиция подстроки Java в вашей строке равна " + position);
        String newStr = str.replace('a', 'o');
        System.out.println(newStr);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }

    public static void task3(String str) {
        int beginIndex = str.length() / 2 - 1;
        int endIndex = str.length() / 2 + 1;
        str = str.substring(beginIndex, endIndex);
        System.out.println(str);
    }
}