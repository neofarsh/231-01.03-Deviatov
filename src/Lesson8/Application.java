package Lesson8;

public class Application {
    public static void main(String[] args) {
        Cat irinka = new Cat();

        irinka.name = "Ирина";
        irinka.height = 148;
        irinka.age = 1;
        irinka.gender = true;

        irinka.voice();

        Dog egor = new Dog("егор", 25, 120);

        System.out.println(egor.getName());
    }
}
