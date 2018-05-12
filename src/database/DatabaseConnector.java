package database;

import com.j256.ormlite.jdbc.JdbcConnectionSource;

import java.sql.SQLException;

public class DatabaseConnector {

    private static DatabaseConnector instance = null;

    public static DatabaseConnector getInstance() {
        if(instance == null) {
            instance = new DatabaseConnector();
        }
        return instance;
    }

    private JdbcConnectionSource connection;


    private DatabaseConnector() {
        try {
            connection = new JdbcConnectionSource("jdbc:mysql://localhost:8889/sushi_container_systems","root","root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public JdbcConnectionSource getConnection() {
        return connection;
    }
}
