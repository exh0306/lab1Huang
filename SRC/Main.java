public class Main {
    public static void main(String[] args) {
        Motorcycle m1 = new Motorcycle("Red");
        Motorcycle m2 = new Motorcycle("Pink" );
        Motorcycle m3 = new Motorcycle("Blue");
        System.out.println("Motorcycle 1 color: " + m1.getColor());
        System.out.println("Motorcycle 1 size: " + m1)
        System.out.println("Motorcycle 2 color: " + m2.getColor());
        System.out.println("Motorcycle 3 color: " + m3.getColor());

        Engine myEng= new Engine("680");
        System.out.println("m1 engine: " + myEng.getCC());
        Engine myEng2= new Engine("640", "450");
        System.out.println("m2 engine: " + myEng2.getCC());
        Engine myEng3= new Engine("720", "700");
        System.out.println("m3 engine: " + myEng3.getCC());

    }
}

