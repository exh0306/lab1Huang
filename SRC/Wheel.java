/**
 * The Wheel class represents a motorcycle wheel.
 * It stores the size of the wheel.
 * @author emletyhuang
 *
 */
public class Wheel {

    /** Size of the wheel*/
    private double size;

    /**
     * Constructs a Wheel with the specified size.
     *
     * @param size the size of the wheel
     */
    public Wheel(double size) {
        this.size = size;
    }

    /**
     * Returns the size of the wheel.
     *
     * @return the wheel size
     */
    public double getSize() {
        return size;
    }

    /**
     * Sets the size of the wheel.
     *
     * @param size the new wheel size
     */
    public void setSize (double size) {
        this.size = size;
    }
}
