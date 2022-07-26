package programmer.zaman.now.data;

public enum Level { // Members di Enum
    STANDARD("Standard level"),
    PREMIUM("Premium level"),
    VIP("VIP level");

    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
