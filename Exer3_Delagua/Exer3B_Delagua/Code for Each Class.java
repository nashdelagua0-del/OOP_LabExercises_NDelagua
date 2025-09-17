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