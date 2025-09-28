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