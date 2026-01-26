/**

 * Project:
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Emlety Huang
 * Date Developed: 1/15/26
 * Last Date Changed: 1/26/26
 * Rev: 1/26/26

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
     * Adds two numbers and return the result.
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

    /**
     * Returns the color of the motorcycle.
     *
     * @return the motorcycle color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the motorcycle.
     *
     * @param color the new color of the motorcycle
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Returns the size of the wheel
     *
     * @return the wheel size
     */
    public double getSize() {
        return size;
    }

    /**
     * Sets the size of the wheel.
     *
     * @param size of the new wheel size
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * Returns the material used for the motorcycle frame.
     *
     * @return the frame material
     */
    public Material getFrameMaterial() {
        return frame.getMaterial();
    }

    /**
     * Returns the size of the motorcycle wheels.
     *
     * @return the wheel size
     */
    public double getWheelSize() {
        return wheels[0].getSize();
    }

    /**
     * Returns the engine of the motorcycle.
     *
     * @return the motorcycle engine
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * Returns the weight of the motorcycle.
     *
     * @return the motorcycle weight
     */
    public Weight getWeight() {
        return weight;
    }

    /**
     * Starts the motorcycle.
     */
    public void start() {
        System.out.println("Motorcycle starting!");
    }

    /**
     * Stops the motorcycle.
     */
    public void stop() {
        System.out.println("Motorcycle stopping!");
    }
}





