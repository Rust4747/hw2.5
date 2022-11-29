import java.sql.Driver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {


    public String brand;

    public String model;

    private float  enginevolume;

    private List<Driver> drivers = new ArrayList<>();
    private List<Mechanic<?>> mechanics = new ArrayList<>();
    private List<Sponsore> sponsores = new ArrayList<>();







    public Transport(String brand, String model, float enginevolume) {
        this.brand = brand;
        this.model = model;
        this.enginevolume = enginevolume;

    }

    public void addDriver(Driver... drivers){
        this.drivers.addAll(Arrays.asList(drivers));
    }
    public void addMechanic(Mechanic<?>... mechanics){
        this.mechanics.addAll(Arrays.asList(mechanics));
    }
    public void addSponsore(Sponsore... sponsores){
        this.sponsores.addAll(Arrays.asList(sponsores));
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

    public abstract boolean service();

    public abstract void repair();

    public List<Driver> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public List<Sponsore> getSponsores() {
        return sponsores;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand= '" + brand + '\'' +
                ", model=' " + model + '\'' +
                ", enginevolume=" + enginevolume +
                '}';
    }
}



