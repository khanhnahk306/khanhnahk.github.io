package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC {
    private String hostName = "localhost:8084";
    private String dbName = "Customer";
    private String username = "root";
    private String password = "123456";

    private String url = "jdbc:mysql://" + hostName + "/" + dbName;

    public Connection connect() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
