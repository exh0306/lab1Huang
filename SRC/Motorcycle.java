/**

 * Project:
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Emlety Huang
 * Date Developed: 1/15/26
 * Last Date Changed: 1/23/26
 * Rev:

 */
// Motorcycle class
public class Motorcycle {
    /**
     * The color of the motorcycle
     */
    public String color;
    /**
     * The size of the motorcycle
     */
    private double size;
    private Frame frame;
    private Wheel[] wheels;
    /**
     * the engine of the motorcycle
     */
    private Engine engine;
    /**
     * the weight in kg of the motorcycle
     */
    private Weight weight;


    /**
     *
     * @param color The color of the motorcycle frame.
     * @param size The size of the motorcycle  frame.
     * @param frameMaterial The material used to build the motorcycle frame.
     * @param wheelSize The size of the motorcycle wheels.
     * @param engine The engine used by the motorcycle.
     * @param weight The total weight of the motorcycle.
     */

    public Motorcycle(String color, double size, Material frameMaterial, double wheelSize, Engine engine, Weight weight) {
        this.color = color;
        this.size = size;
        this.frame = new Frame(frameMaterial);
        this.wheels = new Wheel[2];
        this.wheels[0] = new Wheel(wheelSize);
        this.wheels[1] = new Wheel(wheelSize);
        this.engine = engine;
        this.weight = weight;
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

    public Material getFrameMaterial() {
        return frame.getMaterial();
    }

    public double getWheelSize() {
        return wheels[0].getSize();
    }

    public Engine getEngine() {
        return engine;
    }

    public Weight getWeight() {
        return weight;
    }

    public void start() {
        System.out.println("Motorcycle starting!");
    }

    public void stop() {
        System.out.println("Motorcycle stopping!");
    }
}





