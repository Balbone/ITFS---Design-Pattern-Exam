// Definendo Animal come astratta posso usare il Binding Dynamico per astrarre lo shalter come un array di tipo
// apparente Animal, ma di tipo esatto quello specifico della specie che estende la classe astratta Animal.
abstract class Animal {
   private String name, breed;
   private int age, conditions; // condizioni di salute dell'animale adottato

   public Animal(String breed, int age, int conditions) {
      this.breed = breed;
      this.age = age;
      this.conditions = conditions;
   }

   // OVERLOADING: ridefinisco il costruttore della classe Animal per accettare anche l'inizializzazione del campo "name"
   public Animal(String name, String breed, int age, int conditions) {
      this.name = name;
      this.breed = breed;
      this.age = age;
      this.conditions = conditions;
   }

   // Converto l'astrazione dell'animale in una stringa. OVERWRITING: ridefinisco il metodo toString() della classe Object
   public String toString() {
      String s = "\n nome: " + name + ", razza: " + breed + ", eta': " + age + ", condizioni generali: " + conditions + "%";
      return s;
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

   public int getAge() {
      return age;
   }

   public String getConditions() {
      return name;
   }

   public void setConditions(int conditions) {
      this.conditions = conditions;
   }

   // Il metodo equals() fa parte dei metodi "standard" delle librerie Java, lo ridefinisco perchè mi serve definire
   // un concetto di uguaglianza tra gli animali.
   public boolean equals(Animal otherAnimal) {
      // Per definire l'uguaglianza uso i campi comuni a tutti gli animali. Tali campi rendono univoco il
      // riconoscimento di un animale ospitato nello shelter
      return
              (this.name.equalsIgnoreCase(otherAnimal.name))
                      &&
                      (this.breed.equalsIgnoreCase(otherAnimal.breed))
                      &&
                      (this.age == otherAnimal.age);
   }
}


class Dog extends Animal {

   // Subclasses add more feature alla classe che specializzano
   private String size;

   public Dog(String breed, int age, String size, int conditions) {
      super(breed, age, conditions);
      this.size = size;
   }

   public Dog(String name, String breed, int age, String size, int conditions) {
      super(name, breed, age, conditions);
      this.size = size; // NB: this esplicito
   }

   // OVERWRTING del metodo toString()
   public String toString() {
      String s = super.toString() + ", taglia: " + size + ", animale: cane"; // NB: this implicito

      return s;
   }
}


class Cat extends Animal {
   private boolean longFur;

   public Cat(String breed, int age, boolean longFur, int conditions) {
      super(breed, age, conditions);
      this.longFur = longFur;
   }

   public Cat(String name, String breed, int age, boolean longFur, int conditions) {
      super(name, breed, age, conditions);
      this.longFur = longFur;
   }

   public String toString() {
      String s = super.toString() + ", pelo lungo: " + longFur + ", animale: gatto";;

      return s;
   }
}


class Sheep extends Animal {
   private String sex;

   public Sheep(String breed, int age, String sex, int conditions) {
      super(breed, age, conditions);
      this.sex = sex;
   }

   public Sheep(String name, String breed, int age, String sex, int conditions) {
      super(name, breed, age, conditions);
      this.sex = sex;
   }

   public String toString() {
      String s = super.toString() + ", sesso: " + sex + ", animale: pecora";

      return s;
   }
}


class Donkey extends Animal {

   public Donkey(String breed, int age, int conditions) {
      super(breed, age, conditions);
   }

   public Donkey(String name, String breed, int age, int conditions) {
      super(name, breed, age, conditions);
   }

   public String toString() {
      String s = super.toString() + ", animale: asino";

      return s;
   }
}


class Piglet extends Animal {
   public Piglet(String breed, int age, int conditions) {
      super(breed, age, conditions);
   }

   public Piglet(String name, String breed, int age, int conditions) {
      super(name, breed, age, conditions);
   }

   public String toString() {
      String s = super.toString() + ", animale: maialino";

      return s;
   }
}