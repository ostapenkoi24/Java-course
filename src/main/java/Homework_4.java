public class Homework_4 {
    public static void main(String[] args) {
        Dog dog = new Dog("Spike",2,"Black", 50);
        dog.print();

        System.out.println("\n");
        Dog dog1 = new Dog(3, 65);
        dog1.print();

        System.out.println("\n");
        Dog dog2 = new Dog();

        System.out.println("\n");
        System.out.println(dog.getAge());
        System.out.println(dog1.getColor());

        dog1.setAge(5);
        System.out.println("\n");
        System.out.println(dog1.getAge());

        System.out.println("\n");
        System.out.println(dog1.getHeight());

        System.out.println("\n");
        System.out.println(dog.getName());
    }


}
