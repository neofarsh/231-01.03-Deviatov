package Lesson10;

public class Cat {
    private String name;
    private int speed;
    private int weight;

    private int countMouse;
    private Mouse[] caughtMouse;


    public Cat(String name, int speed, int weight) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.caughtMouse = new Mouse[100];
        this.countMouse = 0;

    }

    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public int getWeight() {
        return weight;
    }

    public void CatchMouse(Mouse mouse) {
        if (countMouse < 100 && speed > mouse.getSpeed()) {
            System.out.println("кот поймал мыш.");
            countMouse += 1;
            caughtMouse[countMouse] = mouse;
        } else {
            System.out.println("не поймал.");
        }
    }
    
    public void FightCat(Cat cat) {
        if (weight > cat.getWeight()) {
            System.out.println("кот победил! лови награды");

        } else {
            System.out.println("кот не победил! сейчас будет контро-поедания мышей))");

        }
    }



}
