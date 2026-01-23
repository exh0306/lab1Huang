public class Motorcycle {

    public String color;
    public double size;
    public Frame frame;
    public Wheel[] wheels;
    public Engine engine;

    public Motorcycle(String color, double size, Material frameMaterial, double wheelSize, Engine engine) {
        this.color = color;
        this.size = size;
        this.frame = new Frame(frameMaterial);
        this.wheels = new Wheel[2];
        this.wheels[0] = new Wheel(wheelSize);
        this.wheels[1] = new Wheel(wheelSize);
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }
}



