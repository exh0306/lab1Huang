public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine ("680");
        Engine e2 = new Engine ("640", "550");
        Engine e3 = new Engine ("720", "700");

        Motorcycle m1 = new Motorcycle("Red", 60.5, Material.TI, 22.0, e1);
        Motorcycle m2 = new Motorcycle("Pink", 88.0, Material.STEEL, 23.0, e2);
        Motorcycle m3 = new Motorcycle("Blue",75.0, Material.MAGNESIUM, 33.5, e3);
        System.out.println("Motorcycle 1 color: " + m1.getColor());
        System.out.println("Motorcycle 1 size: " + m1.getSize());
        System.out.println("Motorcycle 1 material: " + m1.getFrameMaterial());
        System.out.println("Motorcyle 1 engine cc: " + m1.getEngine().getCC());

        System.out.println("Motorcycle 2 color: " + m2.getColor());
        System.out.println("Motorcycle 2 size: " + m2.getSize());
        System.out.println("Motorcycle 2 material: " + m2.getFrameMaterial());
        System.out.println("Motorcyle 2 engine cc: " + m2.getEngine().getCC());

        System.out.println("Motorcycle 3 color: " + m3.getColor());
        System.out.println("Motorcycle 3 size: " + m3.getSize());
        System.out.println("Motorcycle 3 material: " + m3.getFrameMaterial());
        System.out.println("Motorcyle 3 engine cc: " + m3.getEngine().getCC());


    }
}

