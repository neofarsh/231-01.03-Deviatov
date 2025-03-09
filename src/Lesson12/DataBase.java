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
        String sql = "INSERT INTO films VALUES (?, ?, ?, ?);";
        PreparedStatement statement = getDbConnection().prepareStatement(sql);
        statement.setString(1, name);
        statement.setString(2, author);
        statement.setInt(3, code);
        statement.setString(4, rating);
        statement.executeUpdate();
    }

    public void removeFilms(int code) throws ClassNotFoundException, SQLException {
        String sql = "DELETE FROM films WHERE code=?;";
        PreparedStatement statement = getDbConnection().prepareStatement(sql);
        statement.setInt(1, code);
        statement.executeUpdate();
    }

    public void searchFilms(String column, String value) throws ClassNotFoundException, SQLException {
        String sql = "SELECT * FROM films WHERE " + column + "=?;";
        PreparedStatement statement = getDbConnection().prepareStatement(sql);
        statement.setString(1, value);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            System.out.println("Название: " + resultSet.getString("name") + ", Автор: " + resultSet.getString("author") +
                    ", Код: " + resultSet.getInt("code") + ", Рейтинг: " + resultSet.getString("rating"));
        }
    }
}
