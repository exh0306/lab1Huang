public class Engine {

    private String cc;
    private String hp;

    public Engine(String cc){
        this.cc = cc;
    }

    public Engine(String cc, String hp) {
        this.cc = cc;
        this.hp = hp;
    }

    public void setCc(String c1){
        this.cc = c1;
    }
    public String getCC (){
        return this.cc;
    }
    public void setHp(String hp1){}
}
