class Shape { // Super keyword

    int getCorner() {
        return 0;
    }
}

class Rectangle extends Shape {

    int getCorner() {
       return 4;
    }

    int getParentCorner() {
        return super.getCorner(); // Kata kunci super untuk mengakses dari class child ke class parent
    }
}
