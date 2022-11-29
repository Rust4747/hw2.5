public class Sponsore {

    private String name;
    private int amount;

    public Sponsore(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;

    }

    public int getAmount() {
        return amount;
    }

    public void sponsoredRace() {
        System.out.printf("спонсор %s пронспонсировал  заезд на %d%n", name , amount);
    }
}
