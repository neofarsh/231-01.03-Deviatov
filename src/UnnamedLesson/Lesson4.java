package UnnamedLesson;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        System.out.print("введи количество кругов: ");
        Scanner sc = new Scanner(System.in);
        int cycle = sc.nextInt();

        int otj = 0;
        int prd = 0;
        int prs = 0;
        for (int i=0; i < cycle; i++) {
            System.out.println((i + 1) + " круг:");
            if (i == cycle - 1) {
                prs+= 7;
            } else if (i % 2 == 0) {
                otj+= 3;
            } else {
                prd+= 5;
            }
            System.out.println("  " + otj + " отжимание");
            System.out.println("  " + prd + " приседание");
            System.out.println("  " + prs + " пресса");

        }

    }
}
