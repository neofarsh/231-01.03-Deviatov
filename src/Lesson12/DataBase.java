package Lesson12;
import java.sql.*;

public class DataBase {
    private final String db_host = "localhost";
    private final String db_port = "5432";
    private final String db_name = "devyatov";
    private final String db_login = "postgres";
    private final String db_password = "";

    private Connection dbConnection;

    private Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String str = "jdbc:postgresql://" + db_host + ":" + db_port + "/" + db_name;
        Class.forName("org.postgresql.Driver");
        dbConnection = DriverManager.getConnection(str, db_login, db_password);
        return dbConnection;
    }

    public void isConnection() throws SQLException, ClassNotFoundException {
        dbConnection = getDbConnection();
        System.out.println("база данных подключена");
    }

    public void addFilms(String name, String author, int code, String rating) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO films VALUES ('" + name + "', '" + author + "', " + code + ", '" + rating + "');";
        Statement statement = getDbConnection().createStatement();
        statement.executeUpdate(sql);
    }

    private void removeFilm(double code) throws ClassNotFoundException, SQLException {
        String sql = "DELETE FROM films WHERE code=" + code +  ";";
        Statement statement = getDbConnection().createStatement();
        statement.executeUpdate(sql);
    }
}
