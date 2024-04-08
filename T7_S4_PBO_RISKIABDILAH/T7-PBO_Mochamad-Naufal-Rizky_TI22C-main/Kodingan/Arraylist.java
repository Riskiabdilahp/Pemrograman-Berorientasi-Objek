import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("ArrayList: " + animals);

        // Using remove()
        String element = animals.remove(1);
        System.out.println("Removed Element: " + element);

        System.out.println("New ArrayList: " + animals);
    }
}    
