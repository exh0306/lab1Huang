/**
 * The Engine class represents a motorcycle engine.
 *It stores information such as engine displacement (cc)
 * and horsepower(hp)
 *
 */
public class Engine {

    /** Engine displacement in cubic centimeters */
    private String cc;

    /** Engine horsepower */
    private String hp;

    /**
     * Constructs an Engine with the specified displacement
     *
     * @param cc the engine displacement in cubic centimeters
     */
    public Engine(String cc){
        this.cc = cc;
    }

    /**
     * Constructs an Engine with the specified displacement and horsepower.
     * @param cc the engine displacement in cubic centimeters
     * @param hp the engine horsepower
     */
    public Engine(String cc, String hp) {
        this.cc = cc;
        this.hp = hp;
    }

    /**
     * Sets the engine displacement.
     *
     * @param c1 the new engine displacement
     */
    public void setCc(String c1){
        this.cc = c1;
    }

    /**
     * Returns the engine displacement.
     *
     * @return the engine displacement
     */
    public String getCC (){
        return this.cc;
    }

    /** Sets the engine horsepower.
     *
     * @param hp1 the new engine horsepower
     */
    public void setHp(String hp1){
        this.hp = hp1;
    }

    /**
     * Returns the engine horsepower.
     *
     * @return the engine horsepower
     */
    public String getHP () {
        return this.hp;
    }
}

