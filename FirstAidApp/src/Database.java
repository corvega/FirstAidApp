import java.sql.*;

/**
 * Database
 */
public class Database {

    private final String URL = "jdbc:mariadb://root@localhost/";
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DB_NAME = "inse";

    /**
     * This just creates a connection to the database to be used within this class.
     */
    private Connection connectToDatabase() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new Error(e.toString());
        }
    }

    private void closeConnectionToDatabase(Connection conn) {
        try {
            conn.close();
        } catch (SQLException e) {
            throw new Error(e.getMessage());
        }
    }

}