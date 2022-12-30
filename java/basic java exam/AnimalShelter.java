import java.util.ArrayList; 
import java.util.List;


public class AnimalShelter { 
    private List<Animal> animals;

    public AnimalShelter() { 
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) { 
        animals.add(animal);
    }

    public void adoptAnimal(Animal animal) {
        animals.remove(animal); 
    }

    public List<Animal> getAnimals() {
        return animals; 
    }
}


abstract class Animal { 
    private String name; 
    private String breed; 
    private int age;

    public Animal(String name, String breed, int age) { 
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() { 
        return name;
    }

    public void setName(String name) { 
        this.name = name;
    }

    public String getBreed() { 
        return breed;
    }

    public void setBreed(String breed) { 
        this.breed = breed;
    }

    public int getAge() { 
        return age;
    }

    public void setAge(int age) {
        this.age = age; 
    }
}


class Dog extends Animal {
    public Dog(String name, String breed, int age) {
        super(name, breed, age); 
    }
}

class Cat extends Animal {
    public Cat(String name, String breed, int age) {
        super(name, breed, age); 
    }
}

/*
This code defines an AnimalShelter class that manages a list of Animal objects. 

The Animal class is an abstract class that represents an animal and has three fields: 
- name
- breed
- age. 

The AnimalShelter class has three methods: 
- addAnimal: adds an animal to the list of animals
- adoptAnimal: removes an animal from the list of animals
- getAnimals: returns the list of animals.

The Dog and Cat classes extend the Animal class and represent specific types of animals.

Example of use: 
 */

AnimalShelter shelter = new AnimalShelter();

Animal dog1 = new Dog("Buddy", "Labrador", 6); 
Animal cat1 = new Cat("Tom", "European", 5); 
Animal cat2 = new Cat("Dorotea", "Siamese", 2);

shelter.addAnimal(dog1); 
shelter.addAnimal(cat1); 
shelter.addAnimal(cat2);

List<Animal> animals = shelter.getAnimals();

for (Animal animal : animals) {
    System.out.println(animal.getName() + " is a " + animal.getAge() + " year old " + animal.getBreed());
}
shelter.adoptAnimal(cat1); 

animals = shelter.getAnimals();