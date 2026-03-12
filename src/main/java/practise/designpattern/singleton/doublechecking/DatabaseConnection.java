package practise.designpattern.singleton.doublechecking;

public class DatabaseConnection {
    private static volatile DatabaseConnection databaseConnection = null;

    private DatabaseConnection(){
    }

    public static DatabaseConnection getInstance(){
        if(databaseConnection == null){
            synchronized (DatabaseConnection.class){
                if(databaseConnection == null){
                    databaseConnection = new DatabaseConnection();
                }
            }
        }
        return databaseConnection;
    }

}

// This will make sure the code is thread safe, fast and dont make the threads to wait ideally.
