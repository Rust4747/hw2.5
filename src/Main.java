public class Main {
    public static void main(String[] args) {



        Car mers = new Car("mers","s500",5.0f,TypeBody.SEDAN);
        Car bmw = new Car("bmw","z4",3.0f,TypeBody.COUPE);



        Truck volvo = new Truck("volvo","fh16",16.0f,Weigth.N3);


        Bus kamaz = new Bus("kamaz","5469",6.8f,Capacity.MEDIUM);

        printInfo(mers);
        printInfo(volvo);
        printInfo(kamaz);






    }
    private static void printInfo (Transport transport) {
        System.out.println(transport.getBrand()+"  "+transport.getModel()+"  "+transport.getEnginevolume());
        transport.printType();
    }
}