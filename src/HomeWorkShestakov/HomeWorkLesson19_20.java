package HomeWorkShestakov;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkLesson19_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        task1();
        task2();
        task3();
        System.out.println("Пожалуйста, напишите несколько слов через пробел.");
        String str = scan.nextLine();
        task4(str);
        task5(str);
    }

    public static void task1() {
        int[] integers = {10, 20, 30, 40, 50};
        int x = integers.length;
        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum += integers[i];
        }
        int average = sum / x;
        System.out.println("Среднее значение введённых вами чисел равно " + average);
    }

    public static void task2() {
        double[] array = {3.5, 5.2, -1.4, 7.8, 2.2, -9.8, 10.9};
        double min = array[0];
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            min = Math.min(array[i], min);
            max = Math.max(array[i], max);
        }
        System.out.println("Максимальное значение элемента массива :" + max);
        System.out.println("Минимальное значение элемента массива :" + min);
    }

    public static void task3() {
        char[] array = {'a', 'b', 'i', 't', 'E', 'r'};
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        System.out.print("Колличество гласных букв в массиве " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = Character.toLowerCase(array[i]);
            for (int j = 0; j < vowels.length; j++) {
                if (array[i] == vowels[j]) {
                    count++;
                }
            }
        }
        System.out.println(" равно " + count);
    }

    public static void task4(String str) {
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                array[i] = '_';
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static void task5(String str) {
        String[] array = str.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
