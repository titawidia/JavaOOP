package programmer.zaman.now.application;

public class EqualsApp { // Equals Method
    public static void main(String[] args) {

        String first = "Aera";
        first = first + " " + "Hye Ren";

        System.out.println(first);

        String second = "Aera Hye Ren";
        System.out.println(second);

        System.out.println(first == second); // false
        System.out.println(first.equals(second)); // true

        String third = "Aera Hye Ren";

        System.out.println(second == third);
        System.out.println(second.equals(third));
    }
}
