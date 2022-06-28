package Homework7;

public enum Size {
    SMALL(37, 46, "S"), MEDIUM(40, 48, "M"),
    LARGE(42, 52, "L"), EXTRA_LARGE(46, 56, "XL");

    private int width;
    private int length;

    private String size;

    Size(int width, int length, String size) {
        this.width = width;
        this.length = length;
        this.size = size;
    }

    public int getWidth() {

        return width;
    }

    public int getLength() {

        return length;
    }

    public String getSize() {

        return size;
    }

    @Override
    public String toString() {

        return getSize() + " or " + super.toString() + " size: width=" + getWidth() + ",length=" + getLength();
    }
}
