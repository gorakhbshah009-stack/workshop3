package week3;

// Program 9: Box class with constructor overloading

class Box {
    double width;
    double height;
    double depth;

    // No-argument constructor: default dimensions
    Box() {
        width  = 10;
        height = 8;
        depth  = 12;
    }

    // Single-argument constructor: cube (all sides equal)
    Box(double side) {
        width  = side;
        height = side;
        depth  = side;
    }

    // Three-argument constructor: cuboid
    Box(double w, double h, double d) {
        width  = w;
        height = h;
        depth  = d;
    }

    void getVolume() {
        double volume = width * height * depth;
        System.out.println("Width=" + width + "  Height=" + height + "  Depth=" + depth);
        System.out.println("Volume = " + volume);
        System.out.println();
    }
}

public class Program9 {
    public static void main(String[] args) {

        System.out.println("--- Default Box ---");
        Box box1 = new Box();
        box1.getVolume();

        System.out.println("--- Cube (side=5) ---");
        Box box2 = new Box(5);
        box2.getVolume();

        System.out.println("--- Cuboid (3 x 4 x 6) ---");
        Box box3 = new Box(3, 4, 6);
        box3.getVolume();
    }
}
