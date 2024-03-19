package Hewan;

class Animal {
    public void sound() {
        System.out.println("Bunyi hewan...");
    }
}

class Anjing extends Animal {
    @Override
    public void sound() {
        System.out.println("Guk guk!");
    }

    // Overloading method sound() dengan parameter
    public void sound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Guk guk!");
        }
    }
}

class Kucing extends Animal {
    @Override
    public void sound() {
        System.out.println("Meong meong!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Anjing();
        Animal cat = new Kucing();

        // Mengeluarkan suara anjing
        dog.sound();

        // Mengeluarkan suara kucing
        cat.sound();
    }
}
