class NeedForSpeed {
    private int distance;
    private int speed;
    private int battery;
    private int batteryDrain;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.distance = 0;
        this.speed = speed;
        this.battery = 100;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.batteryDrain > this.battery;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if (!batteryDrained()) {
            this.distance += this.speed;
            this.battery -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while (car.distanceDriven() < this.distance && !car.batteryDrained())
            car.drive();
        return car.distanceDriven() >= this.distance;
    }
}
