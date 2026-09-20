class FarmAnimal {
    String name;
    String place;
    String food;
    String sound;

    // Constructor
    FarmAnimal(String name, String place,
               String food, String sound) {
        this.name = name;
        this.place = place;
        this.food = food;
        this.sound = sound;
    }

    // Display animal details
    void displayDetails() {
        System.out.println("Animal Name : " + name);
        System.out.println("Stays At    : " + place);
        System.out.println("Eats        : " + food);
        System.out.println("Sound       : " + sound);
        System.out.println();
    }
}

public class FarmAnimals {
    public static void main(String[] args) {

        // Creating Cow object
        FarmAnimal cow = new FarmAnimal(
                "Cow",
                "Cowshed",
                "Grass and Hay",
                "Moo"
        );

        // Creating Pig object
        FarmAnimal pig = new FarmAnimal(
                "Pig",
                "Pigsty",
                "Grains and Vegetables",
                "Oink"
        );

        // Creating Horse object
        FarmAnimal horse = new FarmAnimal(
                "Horse",
                "Stable",
                "Grass and Hay",
                "Neigh"
        );

        System.out.println("===== FARM ANIMALS =====");

        System.out.println("\n--- COW ---");
        cow.displayDetails();

        System.out.println("--- PIG ---");
        pig.displayDetails();

        System.out.println("--- HORSE ---");
        horse.displayDetails();
    }
}
