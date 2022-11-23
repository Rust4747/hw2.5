public enum Capacity {


    EXTRA_SMALL(0, 10),
    SMALL(0, 25),
    MEDIUM(40, 50),
    LARGE(60, 80),
    EXTRA_LARGE(100, 120);


    private int from;
    private int to;

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    Capacity(int from, int to) {
        this.from = from;
        this.to = to;
    }
}
