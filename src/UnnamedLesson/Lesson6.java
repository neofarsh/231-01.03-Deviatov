package UnnamedLesson;

public class Lesson6 {
    public static void main(String[] args) {
        printDog("бобик", 2);
        printDog("ира");
        printDog();

        control("ира");
        control("бездомная");
    }


    public static void printDog(String name, int count) {
        for (int i=0;i<=count; i++) {
            System.out.println("привет, " + name);
        }
    }
    public static void printDog(String name) {
        System.out.println("привет, " + name);
    }
    public static void printDog() {
        System.out.println("привет, бездомная");
    }

    public static void control(String name) {
        if (name.equals("бездомная")) {
            System.out.println("не пускаем");
            return;
        }
        System.out.println("добро пожаловать, " + name);
    }
}
