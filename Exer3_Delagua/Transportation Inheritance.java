// Base Class
class Transportation {
    public void info() {
        System.out.println("This is a mode of transportation.");
    }
}

// ---------------- Air Transport ----------------
class AirTransport extends Transportation {
    @Override
    public void info() {
        System.out.println("This is an air transport.");
    }
}

class Helicopter extends AirTransport {
    @Override
    public void info() {
        System.out.println("This is a Helicopter.");
    }
}

class Airplane extends AirTransport {
    @Override
    public void info() {
        System.out.println("This is an Airplane.");
    }
}

class SpaceShuttle extends AirTransport {
    @Override
    public void info() {
        System.out.println("This is a Space Shuttle.");
    }
}

// ---------------- Land Transport ----------------
class LandTransport extends Transportation {
    @Override
    public void info() {
        System.out.println("This is a land transport.");
    }
}

class Truck extends LandTransport {
    @Override
    public void info() {
        System.out.println("This is a Truck.");
    }
}

class SUV extends LandTransport {
    @Override
    public void info() {
        System.out.println("This is an SUV.");
    }
}

class Tricycle extends LandTransport {
    @Override
    public void info() {
        System.out.println("This is a Tricycle.");
    }
}

class Motorcycle extends LandTransport {
    @Override
    public void info() {
        System.out.println("This is a Motorcycle.");
    }
}

class Kariton extends LandTransport {
    @Override
    public void info() {
        System.out.println("This is a Kariton (hand/animal-pulled cart).");
    }
}

// ---------------- Water Transport ----------------
class WaterTransport extends Transportation {
    @Override
    public void info() {
        System.out.println("This is a water transport.");
    }
}

class Boat extends WaterTransport {
    @Override
    public void info() {
        System.out.println("This is a Boat.");
    }
}

class Submarine extends WaterTransport {
    @Override
    public void info() {
        System.out.println("This is a Submarine.");
    }
}

// ---------------- Tester Class ----------------
public class TransportationTester.{
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
        heli.info();
        plane.info();
        shuttle.info();

        truck.info();
        suv.info();
        tricycle.info();
        motorcycle.info();
        kariton.info();

        boat.info();
        submarine.info();
    }
}