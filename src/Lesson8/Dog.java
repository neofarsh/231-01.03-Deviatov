package Lesson8;

public class Dog {
    String name;
    int age;
    int height;
    boolean gender;
    private boolean aids;

    public void voice() {
        System.out.println("гав-гав");
    }

    public String getName() {
        return name;
    }

    public Dog(String name) {
        this.name = name;

    }
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Dog(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public Dog(String name, int age, int height, boolean gender) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = gender;
    }

}
