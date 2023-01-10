public class DemoAnimalShelter {
   public static void main(String arg[]) {

      // Inizializzo un utente
      User Mila = new User("Mila", "Racca", "Mila.Racca@me.it", "+39 377 24583");
      User Piero = new User("Piero", "Gillono", "Piero.Gillono@me.it", "+39 347 58232");

      // Inizializzo lo shelter definendo il nume di posti che dispone per ospitare gli animali
      AnimalShelter shelter = new AnimalShelter(100);

      Animal dog1 = new Dog("Labrador", 6, "mid", 90);
      Animal dog2 = new Dog("Bassotto", 6, "small", 80);
      Animal cat1 = new Cat("European", 5, false,85);
      Animal cat2 = new Cat("Siamese", 2, true,33);
      Animal sheep1 = new Sheep("Irlandese", 4, "female",95);
      Animal sheep2 = new Sheep("Yorkshire", 4, "female",60);
      Animal sheep3 = new Sheep("British Columbia", 4, "male",70);
      Animal donkey1 = new Donkey("Sarda", 10,90);

      // Ospitando un animale, gli assegno un nome :)
      shelter.hostAnimal(dog1, "Buddy");
      shelter.hostAnimal(dog2, "Otto von Bismarck");
      shelter.hostAnimal(cat1, "Tom");
      shelter.hostAnimal(cat2, "Dorotea");
      shelter.hostAnimal(sheep1, "Margarita");
      shelter.hostAnimal(sheep2, "Jimmy");
      shelter.hostAnimal(sheep3, "Ed");
      shelter.hostAnimal(donkey1, "Arturo");

      System.out.println("\nSituazione dello shelter a un mese dall'apertura:\n" + shelter);

      System.out.println("\nOtto von Bismarck è ospitato nello shelter: " + shelter.checkIfPresent("Otto von Bismarck"));

      Mila.adoptAnimal(shelter, "Otto von Bismarck");

      System.out.println("Otto von Bismarck viene adottato. \nOtto von Bismarck è ospitato nello shelter: " + shelter.checkIfPresent("Otto von Bismarck"));

      System.out.println("\nIl veterinario riesce a curare i due gatti presenti in struttura.");
      Piero.cureAnimal(cat1);
      Piero.cureAnimal(cat2);

      System.out.println("\nSituazione dello shelter:\n" + shelter);
   }
}