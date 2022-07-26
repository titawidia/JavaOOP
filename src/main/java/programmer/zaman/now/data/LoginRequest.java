package programmer.zaman.now.data;

public record LoginRequest(String username, String password) {

    public LoginRequest { // Compact Constructor, tanpa tanda ()
        System.out.println("Membuat object LoginRequest");
    }

    public LoginRequest(String username) {

        this (username, "");
    }

    public LoginRequest() {

        this("", "");
    }
}
