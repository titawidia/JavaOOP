class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Aera", "Majalengka"); // Parameter Constructor

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        // Mengakses Method kedalam class
        person1.sayHello("Jaem");

        Person person2 = new Person("Jaem "); // Parameter Constructor
        Person person3;
        person3 = new Person(); // Parameter Constructor
        person3.name = "Mark";
        person3.sayHello("Jaem");

    }
}
