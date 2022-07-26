public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Aera");
        employee.sayHello("Jaem");

        employee = new Manager("Aera");
        employee.sayHello("Jaem");

        employee = new VicePresident("Aera");
        employee.sayHello("Jaem");

        //Method Polymorphism
        sayHello(new Employee("Aera"));
        sayHello(new Manager("Mark"));
        sayHello(new VicePresident("Jaem"));
    }

    // Type Check & Casts
    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee; // konversi
            System.out.println("Hello " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
