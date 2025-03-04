package UnnamedLesson;

import java.util.Arrays;

public class Lesson1 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 130) + 20;
        }
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int min = 9999;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        int arg = 0;
        for (int i = 0; i < array.length; i++) {
            arg += array[i];
        }
        arg = arg / array.length;

        System.out.println("маленькое: " + min);
        System.out.println("большое: " + max);
        System.out.println("средне: " + arg);
        System.out.println("ваще все: " + Arrays.toString(array));
    }
}