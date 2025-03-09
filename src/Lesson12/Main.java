package Lesson12;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DataBase db = new DataBase();
        Scanner sc = new Scanner(System.in);
        db.isConnection();


        System.out.println("\n\nдобро пожаловать в фильмографию!");
        while (true) {
            System.out.println("---------");
            System.out.println("введите ваш запрос:");
            System.out.println("1. добавить фильм");
            System.out.println("2. удалить фильм");
            System.out.println("3. выйти");

            int menu_number = sc.nextInt();
            if (menu_number == 1) {
                Scanner sc_one = new Scanner(System.in);

                System.out.println("---------");
                System.out.printf("введите название фильма: ");
                String film_name = sc_one.nextLine();

                System.out.printf("введите автора: ");
                String film_author = sc_one.nextLine();

                System.out.printf("введите код: ");
                int film_code = sc_one.nextInt();
                sc_one.nextLine();

                System.out.printf("введите рейтинг: ");
                String film_rating = sc_one.nextLine();

                db.addFilms(film_name, film_author, film_code, film_rating);
                System.out.println("\n\nфильм добавлен успешно!");

            } else if (menu_number == 2) {
                Scanner sc_two = new Scanner(System.in);
                
                System.out.printf("введите код фильма, которого хотите удалить: ");
                int remove_code = sc_two.nextInt();
                
                db.removeFilms(remove_code);
                System.out.println("\n\nфильм удален успешно!");
            } else if (menu_number == 3) {
                break;
            } else if (menu_number == 4) {
                System.out.println("выберите критерий поиска:");
                System.out.println("1. название");
                System.out.println("2. автор");
                System.out.println("3. код");
            
                int search_option = sc.nextInt();
                sc.nextInt();
            
                String column = "";
                String value = "";
            
                if (search_option == 1) {
                    column = "name";
                    System.out.printf("введите название: ");
                } else if (search_option == 2) {
                    column = "author";
                    System.out.printf("введите автора: ");
                } else if (search_option == 3) {
                    column = "code";
                    System.out.printf("введите код: ");
                }
                value = sc.nextLine();
                db.searchFilms(column, value);
            } else {
                    System.out.printf("неправильная команда!");
            }
        }

    }

}
