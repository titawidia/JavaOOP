package programmer.zaman.now.data;

public class Avanza implements Car{ // Implements Interface

    public void drive() {
        System.out.println("Avanza drive");
    }

    public int getTier() {

        return 4;
    }

    public String getBrand() {

        return null;
    }

    public boolean isMaintenance() {

        return false;
    }

    public boolean isBig() { // Default method
        return false;
    }
}
