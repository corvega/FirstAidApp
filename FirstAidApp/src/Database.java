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

    /**
     * Will drop the database.
     */
    public void dropDatabase() {
        String query = String.format("DROP DATABASE %s", DB_NAME);
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

    /**
     * Create a new table
     * 
     * @param tableName the name of the table
     * @param schema    the schema that will be inserted into the database. Example
     *                  <code> id integer PRIMARY KEY,\n name text NOT NULL </code>
     */
    public void createNewTable(String tableName, String schema) {
        Connection conn = connectToDatabase();
        try {
            // Uses the format string instead of the pluses
            String parsedQuery = String.format("CREATE TABLE IF NOT EXISTS %s.%s \n (%s);", DB_NAME, tableName, schema);
            PreparedStatement query = conn.prepareStatement(parsedQuery);
            query.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            closeConnectionToDatabase(conn);
        }
    }

    /**
     * Get the results from a query
     * 
     * @param query which is wanted to be used
     * @return ResultSet which contains the results
     */
    public ResultSet getQueryResults(String query) {
        Connection conn = connectToDatabase();
        try {
            Statement stmt = conn.createStatement();
            try {
                return stmt.executeQuery(query);
            } catch (SQLException e) {
                throw new Error(e.toString());
            }
        } catch (SQLException e) {
            throw new Error(e.toString());
        } finally {
            closeConnectionToDatabase(conn);
        }
    }

}