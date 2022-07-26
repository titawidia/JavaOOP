public class ManagerApp {
    public static void main(String[] args) {

        // Inheritance
        var manager = new Manager("Aera");
        manager.sayHello("Jaem");

        var vp = new VicePresident("Mark");
        vp.sayHello("Jaem");

        System.out.println(manager);
        System.out.println(vp);
    }
}

