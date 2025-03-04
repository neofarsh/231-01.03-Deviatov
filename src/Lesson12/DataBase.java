package Lesson12;
import java.sql.*;

public class DataBase {
    private final String db_host = "localhost";
    private final String db_port = "5432";
    private final String db_name = "film_db";
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

}
