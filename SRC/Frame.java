public class Frame {

    /** Material used for the motorcycle frame*/
    private Material material;

    /**
     * Constructs a Frame with the specified material.
     *
     * @param material the material of the motorcycle frame
     */
    public Frame(Material material) {
        this.material = material;
    }

    /**
     * Returns the material of the motorcycle frame.
     * @return the frame material
     */
    public Material getMaterial() {
        return material;
    }
}
