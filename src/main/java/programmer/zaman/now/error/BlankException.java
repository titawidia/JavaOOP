package programmer.zaman.now.error;

public class BlankException extends RuntimeException {

    public BlankException(String message) {
        super(message);
    }

    public String getMessage() {
        return super.getMessage();
    }
}
