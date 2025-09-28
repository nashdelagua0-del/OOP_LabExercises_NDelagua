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