package Homework6;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woow");
    }

    @Override
    void greets(Dog another) {
        System.out.println("Woooow");
    }
    void greets(BigDog another){
        System.out.println("Woooooooow");
    }
}
