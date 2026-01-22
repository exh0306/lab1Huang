public class Main {
    public static void main(String[] args) {
        Motorcycle m1 = new Motorcycle("Red", Material.ALUMINIUM, );
        Motorcycle m2 = new Motorcycle("Pink", Material.STEEL, );
        Motorcycle m3 = new Motorcycle("Blue", Material.TI);
        System.out.println("Motorcycle 1 color: " + m1.getColorA());
        System.out.println("Motorcycle 1 material: " + m1.getFrameMaterial());
        System.out.println("Motorcycle 2 color: " + m2.getColorA());
        System.out.println("Motorcycle 3 color: " + m3.getColorA());

        Engine myEng= new Engine("680");
        System.out.println("m1 engine: " + myEng.getCC());
        Engine myEng2= new Engine("640", "450");
        System.out.println("m2 engine: " + myEng2.getCC());

    }
}

