package Lesson10;

public class Main {
    public static void main(String[] args) {
        Cat risk = new Cat("Риск", 15, 5);
        Cat iris = new Cat("Ириска", 8, 14);

        Mouse mouse_1 = new Mouse(10);
        Mouse mouse_2 = new Mouse(5);
        Mouse mouse_3 = new Mouse(2);
        Mouse mouse_4 = new Mouse(14);
        Mouse mouse_5 = new Mouse(21);

        System.out.println(" ");
        System.out.println("сейчас кушает котик 'риск':");
        risk.CatchMouse(mouse_1);
        risk.CatchMouse(mouse_2);
        risk.CatchMouse(mouse_3);
        risk.CatchMouse(mouse_4);
        risk.CatchMouse(mouse_5);


        System.out.println(" ");
        System.out.println("сейчас кушает кошечка 'ириска':");
        iris.CatchMouse(mouse_1);
        iris.CatchMouse(mouse_2);
        iris.CatchMouse(mouse_3);
        iris.CatchMouse(mouse_4);
        iris.CatchMouse(mouse_5);

        System.out.println(" ");
        System.out.println("а теперь сражение!");
        iris.FightCat(risk);

    }
}
