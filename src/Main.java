import driver.Driver;
import driver.DriverB;
import jdk.jfr.Category;

public class Main {
    public static void main(String[] args) {



        Car mers = new Car("mers","s500",5.0f,TypeBody.SEDAN);
        Car bmw = new Car("bmw","z4",3.0f,TypeBody.COUPE);



        Truck volvo = new Truck("volvo","fh16",16.0f,Weigth.N3);


        Bus kamaz = new Bus("kamaz","5469",6.8f,Capacity.MEDIUM);

        service(mers,bmw,volvo,kamaz);



        printInfo(mers);
        printInfo(volvo);
        printInfo(kamaz);






    }

    private static void service (Transport... transports) {
        for (Transport transport : transports) {
            if (!transport.service()) {
                try {
                    throw new RuntimeException("" + transport.getBrand() + ""+ transport.getModel()+"");
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    private static void printInfo (Transport transport) {
        System.out.println(transport.getBrand()+" "+transport.getModel()+"  "+transport.getEnginevolume());
        transport.printType();
    }
}