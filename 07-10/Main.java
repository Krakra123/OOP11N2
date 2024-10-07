public class Main {

    public static void main(String[] args) {
        AnimalManager manager = new AnimalManager();

        manager.addAnimal(new Pig());
        manager.addAnimal(new Pig());
        manager.addAnimal(new Pig());

        manager.printAnimals();
    }
}
