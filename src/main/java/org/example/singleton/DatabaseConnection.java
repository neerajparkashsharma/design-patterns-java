package org.example.singleton;

public class DatabaseConnection {

    /*
     Singleton pattern
     Only one instance of this class can be created
     This is useful when you want to limit the number of connections to a database or a file
     or any other resource that can be accessed by multiple threads
     The getInstance() method is used to get the instance of the class
     The constructor is private so that no other class can create an instance of this class
  */

    // region Singleton Implementation
    private static DatabaseConnection instance = null;

    private DatabaseConnection() {
        // Constructor
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();

        }
        return instance;
    }

    public void connect() {

        // Connect to database
        System.out.println("Connected to database");
    }

    // endregion Singleton Implementation

}


class Main {


    public static void main(String[] args) {

        DatabaseConnection connection = DatabaseConnection.getInstance();
        connection.connect();
    }

}




