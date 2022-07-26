class Manager extends Employee {

    String company;

    Manager(String name) {
      super(name);
    }

    Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    // Method Overriding
    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name is Manager " + this.name);
    }
}
