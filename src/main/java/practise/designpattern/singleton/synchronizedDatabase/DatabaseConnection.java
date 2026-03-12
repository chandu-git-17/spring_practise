package practise.designpattern.singleton.synchronizedDatabase;


public class DatabaseConnection {
    private static DatabaseConnection databaseConnection;

    private DatabaseConnection(){
    }

    public static synchronized DatabaseConnection getInstance(){
        return new DatabaseConnection();
    }
}

// This will be thread safe because "synchronized" will make sure that only one thread enters a method.
// But this will make the other threads to wait unnecessarily.
