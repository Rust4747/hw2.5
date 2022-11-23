public class Bus extends Transport {

    private Capacity capacity;
    public Bus(String brand, String model, float enginevolume, Capacity capacity) {
        super(brand, model,  enginevolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void printType() {
        if (capacity==null){
            System.out.println("Данных недостаточно");

        }else {
            System.out.println(capacity.getFrom() + capacity.getTo());
        }
    }
}
