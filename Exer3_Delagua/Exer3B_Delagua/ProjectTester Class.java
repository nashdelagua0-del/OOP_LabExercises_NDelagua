public class ProjectTester {
    public static void main(String[] args) {
        // Air Transport
        Transportation heli = new Helicopter();
        Transportation plane = new Airplane();
        Transportation shuttle = new SpaceShuttle();

        // Land Transport
        Transportation truck = new Truck();
        Transportation suv = new SUV();
        Transportation tricycle = new Tricycle();
        Transportation motorcycle = new Motorcycle();
        Transportation kariton = new Kariton();

        // Water Transport
        Transportation boat = new Boat();
        Transportation submarine = new Submarine();

        // Test all
        System.out.println("---- Air Transport ----");
        heli.info();
        plane.info();
        shuttle.info();

        System.out.println("\n---- Land Transport ----");
        truck.info();
        suv.info();
        tricycle.info();
        motorcycle.info();
        kariton.info();

        System.out.println("\n---- Water Transport ----");
        boat.info();
        submarine.info();
    }
}