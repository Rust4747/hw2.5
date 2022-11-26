public class Bus extends Transport {

    private Capacity capacity;
    public Bus(String brand, String model, float enginevolume, Capacity capacity) {
        super(brand, model,  enginevolume);
        this.capacity = capacity;
    }

    @Override
    public boolean service() {
        System.out.println("Автобус "+ getBrand()+" "+getModel()+" в диагностике не требуется");
        return true;
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
