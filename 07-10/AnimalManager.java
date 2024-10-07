import java.util.ArrayList;
import java.util.List;

public class AnimalManager {
    
    private List<Animal> animalList;

    public AnimalManager() {
        animalList = new ArrayList();
    }

    public void addAnimal(Animal a) {
        animalList.add(a);
    }

    public void printAnimals() {
        for (Animal animal : animalList) {
            System.out.println(animal.ToString());
        }
    }
}
