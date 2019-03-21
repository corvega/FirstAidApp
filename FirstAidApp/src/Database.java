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

    /**
     * Will create a new database if it doesn't exist with the database name giving
     * as a local const variable.
     */
    public void createNewDatabase() {
        String query = "CREATE DATABASE IF NOT EXISTS " + DB_NAME;

        Connection conn = connectToDatabase();
        try {
            Statement stmt = conn.createStatement();
            stmt.execute(query);
        } catch (SQLException e) {
            throw new Error(e.getMessage());
        } finally {
            closeConnectionToDatabase(conn);
        }
    }

}