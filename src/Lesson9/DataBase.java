package Lesson9;

import java.sql.*;

public class DataBase {
    private final String db_host = "localhost";
    private final String db_port = "5432";
    private final String db_name = "music_db_console";
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
        System.out.println(dbConnection.isValid(1000));
    }

    public void createTable(String table_name, String extra) throws ClassNotFoundException, SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS " + table_name + "(" + extra + " );";
        Statement statement = getDbConnection().createStatement();
        statement.executeUpdate(sql);
    }

    public void addValue(String table_name, String value) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO " + table_name + " VALUES (" + value + " );";
        Statement statement = getDbConnection().createStatement();
        statement.executeUpdate(sql);
    }


    public void selectTable(String table_name) throws ClassNotFoundException, SQLException {
        Statement statement = getDbConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * from " + table_name);
        while (resultSet.next()) {
            String line_1 = resultSet.getString(1);
            String line_2 = resultSet.getString(2);
            String line_3 = resultSet.getString(3);
            String line_4 = resultSet.getString(4);
            System.out.println(line_1 + " " + line_2 + " " + line_3 + " " + line_4);
        }
    }
}
