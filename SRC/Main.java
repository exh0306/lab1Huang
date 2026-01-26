/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 *
 * This class contains the main method used to test
 * the Motorcycle, Engine, Weight, and related classes.
 *
 * Author: Emlety Huang
 * Date Developed:1/15/26
 * Last Date Changed: 1/26/26
 * Revision: 1/26/26
 *
 *
 */

/**
 * Main class for Lab 1
 *This class contains the entry point of the program.
 * It demonstrates creating Motorcycle objects with Engine and Weight,
 * and prints their details to the console.
 */
public class Main {
    /**
     * Entry point of the program.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        Engine e1 = new Engine ("680");
        Engine e2 = new Engine ("640", "540");
        Engine e3 = new Engine ("720", "700");

        Weight w1 = new Weight (180.5, "kg");
        Weight w2 = new Weight ( 200.0, "kg");
        Weight w3 = new Weight ( 210.2, "kg");

        Motorcycle m1 = new Motorcycle("Red", 60.5, Material.TI, 22.0, e1, w1);
        Motorcycle m2 = new Motorcycle("Pink", 88.0, Material.STEEL, 23.0, e2, w2);
        Motorcycle m3 = new Motorcycle("Blue",75.0, Material.MAGNESIUM, 33.5, e3, w3);
        System.out.println("Motorcycle 1 color: " + m1.getColor());
        System.out.println("Motorcycle 1 size: " + m1.getSize());
        System.out.println("Motorcycle 1 frame material: " + m1.getFrameMaterial());
        System.out.println("Motorcycle 1 wheel size: " + m1.getWheelSize());
        System.out.println("Motorcycle 1 engine cc: " + m1.getEngine().getCC());
        System.out.println("Motorcycle 1 weight: " + m1.getWeight().getValue() + " " + m1.getWeight().getUnit());
        m1.start();
        m1.stop();

        System.out.println("Motorcycle 2 color: " + m2.getColor());
        System.out.println("Motorcycle 2 size: " + m2.getSize());
        System.out.println("Motorcycle 2 frame material: " + m2.getFrameMaterial());
        System.out.println("Motorcycle 2 wheel size: " + m2.getWheelSize());
        System.out.println("Motorcycle 2 engine cc: " + m2.getEngine().getCC());
        System.out.println("Motorcycle 2 weight: " + m2.getWeight().getValue() + " " + m2.getWeight().getUnit());
        m2.start();
        m2.stop();

        System.out.println("Motorcycle 3 color: " + m3.getColor());
        System.out.println("Motorcycle 3 size: " + m3.getSize());
        System.out.println("Motorcycle 3 frame material: " + m3.getFrameMaterial());
        System.out.println("Motorcycle 3 wheel size: " + m3.getWheelSize());
        System.out.println("Motorcycle 3 engine cc: " + m3.getEngine().getCC());
        System.out.println("Motorcycle 3 weight: " + m3.getWeight().getValue() + " " + m3.getWeight().getUnit());
        m3.start();
        m3.stop();

    }
}

