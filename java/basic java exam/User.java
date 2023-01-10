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