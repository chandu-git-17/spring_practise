package practise.designpattern.singleton.FirstApproach;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection = null;

    public DatabaseConnection(){
    }

    public static DatabaseConnection getInstance(){
        if(databaseConnection == null){
            databaseConnection = new DatabaseConnection();
        }
        return databaseConnection;
    }

}

// Now, if we want to use this db connection in other classes,
// DatabaseConnection db1 = DatabaseConnection.getInstance();
// DatabaseConnection db2 = DatabaseConnection.getInstance();
// now both objects point to the same object, which means this follows Singleton pattern.
// This will not work for multithreaded environment.
// Any number of threads can enter the if loop in the above code.

