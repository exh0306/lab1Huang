public class Weight {
    private double value;
    private String unit;

    public Weight(double value) {
        this.value = value;
        this.unit = "kg";
    }
    public double getValue() {
        return value;
    }
    public String getUnit() {
        return unit;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
}
