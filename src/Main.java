import driver.Driver;
import driver.DriverB;
import jdk.jfr.Category;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mechanic<Car> ivan= new Mechanic<Car>("Иван","Петров","RS");
        Sponsore shell = new Sponsore("shell",1500000);




        Car mers = new Car("mers","s500",5.0f,TypeBody.SEDAN);
        mers.addMechanic(ivan);
        mers.addSponsore(shell);




        Car bmw = new Car("bmw","z4",3.0f,TypeBody.COUPE);



        Truck volvo = new Truck("volvo","fh16",16.0f,Weigth.N3);


        Bus kamaz = new Bus("kamaz","5469",6.8f,Capacity.MEDIUM);

        service(mers,bmw,volvo,kamaz);


        List<Transport> transports = List.of(mers,bmw,volvo,kamaz);
        for (Transport transport : transports) {
            printInfo(transport);
        }


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
        System.out.println(transport.getBrand() + " " + transport.getModel() + "  " + transport.getEnginevolume());
        System.out.println("Спонсоры");
        for (Sponsore sponsore : transport.getSponsores()) {
            System.out.println(sponsore.getName());
        }
        System.out.println("Механики");
        for (Mechanic mechanic : transport.getMechanics()) {
            System.out.println(mechanic.getName() + mechanic.getSurname() + mechanic.getCompany());

        }
    }

}