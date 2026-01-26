/**
 * The Weight class represents the weight of a motorcycle.
 * It stores a numeric value and its unit of measurement.
 *
 * @author emletyhuang
 */
public class Weight {

    /** Numeric weight value */
    private double value;

    /** Unit of measurement for the weight */
    private String unit;

    /**
     * Constructs a Weight object with the specified value.
     * The unit is set to kilograms (kg) by default.
     *
     * @param value the weight value
     * @param unit the unit of measurement (default to kg)
     */
    public Weight(double value, String unit) {
        this.value = value;
        this.unit = "kg";
    }

    /**
     * Returns the weight value.
     *
     * @return the weight value
     */
    public double getValue() {
        return value;
    }

    /**
     * Returns the unit of measurement.
     *
     * @return the weight unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the weight value.
     *
     * @param value the new weight value
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Sets the unit of measurement.
     *
     * @param unit the new weight unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
}
