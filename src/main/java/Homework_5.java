public class Homework_5 {
    public static void main(String[] args) {
        Cat cat= new Cat(false,"meat",2);
        Animal animal = new Animal(true, "carrot", 2);
        System.out.println(cat.isVegetarian()+"\n"+cat.getEats()+"\n"+cat.getNoOfLegs());
        System.out.println("\n");
        System.out.println(animal.isVegetarian()+"\n"+animal.getEats()+"\n"+animal.getNoOfLegs());
    }
}
