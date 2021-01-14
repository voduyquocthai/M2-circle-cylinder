import java.util.Arrays;

public class Cylinder extends Circle {
    private double height = 5.0;

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return this.getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Circle cc = new Circle();
        System.out.println(cc.toString());
        Cylinder cl = new Cylinder();
        System.out.println(cl.toString());
    }
}
