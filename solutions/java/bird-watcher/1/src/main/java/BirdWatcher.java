
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] birdsLastWeek = {0, 2, 5, 3, 7, 8, 4};
        return birdsLastWeek;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean hasDayWithoutBirds = false;
        for (int i = 0; i < this.birdsPerDay.length; i++) {
            if (this.birdsPerDay[i] == 0) {
                hasDayWithoutBirds = true;
                break;
            }
        }
        return hasDayWithoutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        int countNumberOfDays = numberOfDays;
        if (numberOfDays > this.birdsPerDay.length)
            countNumberOfDays = this.birdsPerDay.length;
        for (int i = 0; i < countNumberOfDays; i++)
            count += this.birdsPerDay[i];
        return count;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int i = 0; i < this.birdsPerDay.length; i++)
            if (this.birdsPerDay[i] >= 5)
                busyDays++;
        return busyDays;
    }
}
