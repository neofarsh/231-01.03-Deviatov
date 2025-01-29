package UnnamedLesson;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        System.out.print("задай вопрос своей жизни: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int random_number = (int) (Math.random() * 10);
        if (random_number == 1) {
            System.out.println("конечно");
        } else if (random_number == 2) {
            System.out.println("не думаю");
        } else if (random_number == 3) {
            System.out.println("не стоит");
        } else if (random_number == 4) {
            System.out.println("ты уверен?");
        } else if (random_number == 5) {
            System.out.println("однозначно");
        } else if (random_number == 6) {
            System.out.println("давай завтра");
        } else if (random_number == 7) {
            System.out.println("отмени");
        } else if (random_number == 8) {
            System.out.println("сделай с другом");
        } else if (random_number == 9) {
            System.out.println("да");
        } else if (random_number == 10) {
            System.out.println("не надо");
        }
    }
}
