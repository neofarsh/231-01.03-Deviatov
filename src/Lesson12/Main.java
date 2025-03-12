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
            System.out.println("3. поиск фильма");
            System.out.println("4. обновить фильма");
            System.out.println("5. показать все фильмы");
            System.out.println("6. выйти");

            int menu_number = sc.nextInt();
            if (menu_number == 1) {
                Scanner sc_one = new Scanner(System.in);

                System.out.println("---------");
                System.out.printf("введите название фильма: ");
                String film_name = sc_one.nextLine();

                System.out.printf("введите автора: ");
                String film_author = sc_one.nextLine();

                System.out.printf("введите код: ");
                String film_code = sc_one.nextLine();

                System.out.printf("введите рейтинг: ");
                String film_rating = sc_one.nextLine();

                db.addFilms(film_name, film_author, film_code, film_rating);
                System.out.println("\n\nфильм добавлен успешно!");

            } else if (menu_number == 2) {
                Scanner sc_two = new Scanner(System.in);
                System.out.println("---------");
                System.out.printf("введите код фильма, которого хотите удалить: ");
                int remove_code = sc_two.nextInt();

                db.removeFilms(remove_code);
                System.out.println("\n\nфильм удален успешно!");
            } else if (menu_number == 3) {
                System.out.println("выберите критерий поиска:");
                System.out.println("1. название");
                System.out.println("2. автор");
                System.out.println("3. код");

                int search_option = sc.nextInt();
                String column = "";

                if (search_option == 1) {
                    column = "name";
                } else if (search_option == 2) {
                    column = "author";
                } else if (search_option == 3) {
                    column = "code";
                }
                Scanner sc_two = new Scanner(System.in);
                String value = sc_two.nextLine();
                db.searchFilms(column, value);
            } else if (menu_number == 4) {
                System.out.printf("введите информацию, который хотите обновить: ");
                Scanner sc_two = new Scanner(System.in);
                int update_code = sc_two.nextInt();

                System.out.println("выберите критерий который хотите изменить:");
                System.out.println("1. название");
                System.out.println("2. автор");
                System.out.println("3. код");
                Scanner sc_three = new Scanner(System.in);
                String column = "none";
                int search_option = sc_three.nextInt();
                if (search_option == 1) {
                    column = "name";
                } else if (search_option == 2) {
                    column = "author";
                } else if (search_option == 3) {
                    column = "code";
                }

                System.out.printf("введите код фильма, который хотите обновить: ");
                Scanner sc_4 = new Scanner(System.in);
                String value = sc_4.nextLine();

                db.updateFilms(update_code, column, value);
                System.out.println("\n\nфильм удален успешно!");
            } else if (menu_number == 5) {
                db.allFilms();
            } else if (menu_number == 6) {
                break;
            } else {
                System.out.printf("неправильная команда!");
            }
        }

    }

}