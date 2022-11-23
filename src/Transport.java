public abstract class Transport {


    public String brand;

    public String model;

    private final float  enginevolume;



    public Transport(String brand, String model, float enginevolume) {
        this.brand = brand;
        this.model = model;
        this.enginevolume = enginevolume;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEnginevolume() {
        return enginevolume;
    }

    public abstract void printType();


    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model=' " + model + '\'' +
                ", enginevolume=" + enginevolume +
                '}';
    }
}



