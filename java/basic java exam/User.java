
public class User {
   private String name;
   private String surname;
   private String email;
   private String cell;

   public User(String name, String surname, String email, String cell){
      this.name = name;
      this.surname = surname;
      this.email = email;
      this.cell = cell;
   }

   public boolean adoptAnimal(AnimalShelter shelter, String name){
      return shelter.animalAdopted(name);
   }

   public void cureAnimal(Animal animal){
      animal.setConditions(100);
   }
}

/*
interface User{
   void print();
   public boolean adoptAnimal(AnimalShelter shelter, String name);
   public void cureAnimal(Animal animal);
}

class UserBase implements User{
   private String name;
   private String surname;
   private String email;
   private String cell;

   public User(String name, String surname, String email, String cell){
      this.name = name;
      this.surname = surname;
      this.email = email;
      this.cell = cell;
   }

   void print(){

   };

   public boolean adoptAnimal(AnimalShelter shelter, String name){
      return shelter.animalAdopted(name);
   }

   public void cureAnimal(Animal animal){
      animal.setConditions(100);
   }
}

class Role implements User{
   private User p;

   public Role(User pers){
      p = pers;
   }

   public void print(){
      p.print();
   }
}

class Adopter extends Role{
   private int stipendio;

   public Adopter(User pers, int s){
      super(pers);
      stipendio = s;
   }

   public void print(){
      super.print();
      System.out.println("Stipendio: "+stipendio);
   }
}

class Vetenerary extends Role{
   private String matricola;

   public Vetenerary(User pers, String m){
      super(pers);
      matricola = m;
   }

   public void print(){
      super.print();
      System.out.println("Matricola: "+matricola);
   }

   public void cureAnimal(Animal animal){
      animal.setConditions(100);
   }
}


 */