public class Motorcycle {

    public String color;
    public double size;
    public Frame frame;
    public Wheel[] wheels;

    public Motorcycle(String color, double size, Material frameMaterial, double wheelSize) {
        this.color = color;
        this.size = size;
        this.frame = new Frame(frameMaterial);
        this.wheels = new Wheel[2];
        this.wheels[0] = new Wheel(wheelSize);
        this.wheels[1] = new Wheel(wheelSize);
    }

    public String getColor() {
        return color;
    }
}


}

