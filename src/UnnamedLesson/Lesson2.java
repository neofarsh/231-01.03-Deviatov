package UnnamedLesson;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i=0; i<10; i++) {
            System.out.println("введите " + (i+1) + " число:");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            if (number > 100 || number < 0) {
                System.out.println("ошибка в числе, повторите попытку");
                i--;
            }
            else if (number == 0) {
                System.out.println("выход");
                break;
            }
            else {
                array[i] = number;
                System.out.println((i+1) + " число успешно записано!");
            }
        }
        System.out.println("все числа: " + Arrays.toString(array));
    }
}
