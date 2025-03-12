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

    public void addFilms(String name, String author, String code, String rating) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO films VALUES ('" + name + "', '" + author + "', " + code + ", " + rating + ");";
        PreparedStatement statement = getDbConnection().prepareStatement(sql);
        statement.executeUpdate();
    }

    public void removeFilms(int code) throws ClassNotFoundException, SQLException {
        String sql = "DELETE FROM films WHERE code='" + code + "';";
        PreparedStatement statement = getDbConnection().prepareStatement(sql);
        statement.executeUpdate();
    }

    public void updateFilms(int update_code, String column, String value) throws ClassNotFoundException, SQLException {
        String sql = "UPDATE films SET " + column + " = '" + value + "' WHERE code='" + update_code + "';";
        PreparedStatement statement = getDbConnection().prepareStatement(sql);
        statement.executeUpdate();
    }

    public void searchFilms(String column, String value) throws ClassNotFoundException, SQLException {
        Statement statement = getDbConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM films WHERE " + column + "='" + value + "';");
        while (resultSet.next()) {
            String line_1 = resultSet.getString(1);
            String line_2 = resultSet.getString(2);
            String line_3 = resultSet.getString(3);
            String line_4 = resultSet.getString(4);
            System.out.println(line_1 + " " + line_2 + " " + line_3 + " " + line_4);
        }
    }

    public void allFilms() throws ClassNotFoundException, SQLException {
        Statement statement = getDbConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM films;");
        while (resultSet.next()) {
            String line_1 = resultSet.getString(1);
            String line_2 = resultSet.getString(2);
            String line_3 = resultSet.getString(3);
            String line_4 = resultSet.getString(4);
            System.out.println(line_1 + " " + line_2 + " " + line_3 + " " + line_4);
        }
    }


}