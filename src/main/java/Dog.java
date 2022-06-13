public class Dog {
    private String name;
    private int age;
    private String color;
    private int height;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog(String name, int age, String color, int height) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.height = height;
    }

    public Dog(int age, int height) {
        this.name = "Junior";
        this.age = age;
        this.color = "White";
        this.height = height;
    }
    public Dog() {
        System.out.println("Creating object of the class Dog.");}

    public void print(){
        System.out.println("Name " + this.name);
        System.out.println("Age " + this.age);
        System.out.println("Color " + this.color);
        System.out.println("Height " + this.height + "cm");
    }
}


