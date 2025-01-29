package UnnamedLesson;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        String[] array = new String[10];
        for (int i=0; i < array.length; i++) {
            System.out.println("введите " + (i+1) + " слово:");
            Scanner sc = new Scanner(System.in);
            String word = sc.nextLine();
            if (word.equalsIgnoreCase("выход") || word.equalsIgnoreCase("exit") || word.equalsIgnoreCase("закончить")) {
                break;
            } else {
                array[i] = word;
            }
        }
        System.out.println("все слова: " + Arrays.toString(array));
    }
}
