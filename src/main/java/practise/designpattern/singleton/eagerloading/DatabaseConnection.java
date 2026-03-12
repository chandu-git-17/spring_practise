package practise.designpattern.singleton.eagerloading;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection = new DatabaseConnection();

    private DatabaseConnection(){

    }
    public static DatabaseConnection getInstance(){
        return databaseConnection;
    }
}

// Now this is thread safe, because there is no chance for databaseConnection object creation here.
// Because we are creating it in the class loading time itslef(Eager Loading).
// But this will backfire because the application will take more time to start(Because of eager loading in many classes
