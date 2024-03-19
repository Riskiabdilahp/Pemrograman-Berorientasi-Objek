package Shape;

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Menggambar lingkaran");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Menggambar persegi");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();

        // Menggambar lingkaran
        circle.draw();

        // Menggambar persegi
        square.draw();
    }
}
