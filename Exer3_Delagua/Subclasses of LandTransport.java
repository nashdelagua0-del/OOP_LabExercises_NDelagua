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