package Homework7;

public class Test {
    public static void main(String[] args) {

        Size size = Size.EXTRA_LARGE;
        switch (size) {
            case SMALL:
            case MEDIUM:
            case LARGE:
            case EXTRA_LARGE:
                System.out.println(size);
                break;
        }
    }
}
