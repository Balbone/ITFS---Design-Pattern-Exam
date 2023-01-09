

public class AnimalShelter {

   private int nAnimals = 0; // inizialmente lo shelter non contiene animali
   private Animal[] hostedAnimals;

   // Definisco lo shelter come un array di oggetti, quindi avente una capienza limitata a maxNumAnimals
   public AnimalShelter(int maxNumAnimals) {
      hostedAnimals = new Animal[maxNumAnimals];
   }

   // Converto l'astrazione dell'AnimalShelter in una stringa. Notare la chiamata al metodo toString della classe Animal.
   public String toString() {
      String s = "Numero di animali ospitati = " + nAnimals;

      int i = 0;
      while (i < nAnimals) {
         s = s + hostedAnimals[i].toString();
         ++i;
      }

      return s;
   }

   public int getNumAnimals() {
      return nAnimals;
   }

   public int findHostedAnimalIndex(String name) {
      int i = 0;
      while (i < nAnimals) {
         if (hostedAnimals[i].getName().equalsIgnoreCase(name)) return i;
         ++i;
      }

      return nAnimals;
   }

   public boolean checkIfPresent(String name) {
      return (findHostedAnimalIndex(name) < nAnimals);
   }

   public boolean checkIfFull() {
      return (nAnimals == hostedAnimals.length);
   }

   public boolean hostAnimal(Animal animal, String name) {

      if (checkIfFull()){
         return false; // Se lo shelter è pieno il motodo fallisce
      }

      animal.setName(name);
      hostedAnimals[nAnimals] = animal;
      ++nAnimals; // aggiorno il numero degli animali presenti

      return true;
   }

   public boolean animalAdopted(String name) {
      int i = findHostedAnimalIndex(name);
      if (i == nAnimals) {
         return false; // se l'animale non esiste il motodo fallisce
      }

      --nAnimals;
      hostedAnimals[i] = hostedAnimals[nAnimals];

      return true;
   }
}