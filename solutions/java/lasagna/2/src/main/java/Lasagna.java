public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }
    public int remainingMinutesInOven(int actualMinutes) {
        return actualMinutes - 10;
    }
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }
    public int totalTimeInMinutes(int layers, int minutes) {
        return preparationTimeInMinutes(layers) + minutes;
    }
}
