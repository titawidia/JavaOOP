class Person {
    // Field
    String name;
    String address;
    final String country = "Indonesia";

    // Constructor
    Person(String paramName, String paramAddress) { // Constructor 2 parameter
        this.name = paramName;
        this.address = paramAddress;
    }
    // Constructor Overloading

    Person(String paramName) { // Constructor 1 parameter
        this(paramName, null); // Memanggil Constructor lain
    }

    Person() { // Constructor tanpa parameter
        this(null); // optional
    }

    // variable shadowing
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is " + this.name);
    }
}

