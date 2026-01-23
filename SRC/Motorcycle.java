public class Motorcycle {

    public String color;
    private double size;
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

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Engine getEngine() {
        return engine;
    }

    public Material getFrameMaterial() {
        return frame.getMaterial();
    }

    public double getWheelSize() {
        return wheels[0].getSize();
    }

    public void start() {
        System.out.println("Motorcycle starting");
    }

    public void stop() {
        System.out.println("Motorcycle stopping");
    }
}





