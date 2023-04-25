package part1.task38;

public enum SeasonsOfYear {
    WINTER(90),
    SPRING(92),
    SUMMER(93),
    AUTUMN(91);

    private int days;

    SeasonsOfYear(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }
}
