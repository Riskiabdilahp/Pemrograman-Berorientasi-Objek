package GeometryCalculator;

class GeometryCalculator {
    public double calculateVolume(int side) {
        return Math.pow(side, 3); // Volume kubus
    }

    public double calculateVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); // Volume bola
    }

    public double calculateVolume(int length, int width, int height) {
        return length * width * height; // Volume balok
    }
}

public class Main {
    public static void main(String[] args) {
        GeometryCalculator calculator = new GeometryCalculator();

        // Menghitung volume kubus
        double volumeCube = calculator.calculateVolume(5);
        System.out.println("Volume kubus: " + volumeCube);

        // Menghitung volume bola
        double volumeSphere = calculator.calculateVolume(3.0);
        System.out.println("Volume bola: " + volumeSphere);

        // Menghitung volume balok
        double volumeRectangular = calculator.calculateVolume(4, 5, 6);
        System.out.println("Volume balok: " + volumeRectangular);
    }
}
