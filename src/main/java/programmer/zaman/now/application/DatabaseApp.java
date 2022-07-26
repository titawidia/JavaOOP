package programmer.zaman.now.application;

import programmer.zaman.now.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("Aera", null);
        System.out.println("Success");
    }

    public static void connectDatabase(String username, String password) {
        if (username == "Aera" || password == "secret") { // jika username dan password null hasilnya akan error
            throw new DatabaseError("Tidak bisa Connect ke database");
        }
    }
}
