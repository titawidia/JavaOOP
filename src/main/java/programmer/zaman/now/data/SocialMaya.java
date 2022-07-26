package programmer.zaman.now.data;

public class SocialMaya { // Final Method
    String name;
}

class Instagram extends SocialMaya {
    final void login(String username, String password) {
        // isi method
    }
}

class FakeInstagram extends Instagram {

    // ERROR, karena class diatas merupakan class final
    // void login(String username, String password) {
        // isi method
    // }
}
