class VicePresident extends Manager { // class inheritance

    VicePresident(String name) {
        super(name);
    }
    // Method Overriding
    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name is vp " + this.name);

    }
}